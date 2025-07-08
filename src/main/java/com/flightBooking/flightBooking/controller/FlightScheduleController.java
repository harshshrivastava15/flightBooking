package com.flightBooking.flightBooking.controller;

import com.flightBooking.flightBooking.entity.FlightSchedule;
import com.flightBooking.flightBooking.repository.FlightScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/flightSchedule")
public class FlightScheduleController {

    @Autowired
    private FlightScheduleRepository scheduleRepo;

    @GetMapping
    public List<FlightSchedule> getAllFlights(@RequestParam(defaultValue = "asc") String sort) {
        List<FlightSchedule> flights = scheduleRepo.findAll();
        return sort.equalsIgnoreCase("desc") ?
                flights.stream().sorted(Comparator.comparing(FlightSchedule::getDate).reversed()).toList() :
                flights.stream().sorted(Comparator.comparing(FlightSchedule::getDate)).toList();
    }

    @PostMapping
    public FlightSchedule createSchedule(@RequestBody FlightSchedule newSchedule) {
        return scheduleRepo.save(newSchedule);
    }

    @GetMapping("/id/{id}")
    public FlightSchedule getScheduleById(@PathVariable Long id) {
        return scheduleRepo.findById(id).orElse(null);
    }
}
