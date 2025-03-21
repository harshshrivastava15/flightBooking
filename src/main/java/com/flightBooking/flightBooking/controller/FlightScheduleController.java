package com.flightBooking.flightBooking.controller;

import com.flightBooking.flightBooking.services.FlightSchedule;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flightSchedule")
public class FlightScheduleController {
    private FlightSchedule schedule = new FlightSchedule();

    @GetMapping
    public FlightSchedule getAll(){
        return schedule;
    }


    @PostMapping
    public String createEntry(@RequestBody FlightSchedule testSchedule){
        schedule.setId(testSchedule.getId());
        schedule.setAirline(testSchedule.getAirline());
        schedule.setDate(testSchedule.getDate());
        schedule.setDestination(testSchedule.getDestination());
        schedule.setDepartureTime(testSchedule.getDepartureTime());
        schedule.setArrivalTime(testSchedule.getArrivalTime());

        return "Schedule ho gaya";

    }

    @GetMapping("id/{myId}")
    public FlightSchedule getScheduleById(@PathVariable String myId) {
        if (schedule.getId() != null && schedule.getId().equals(myId)) {
            return schedule;
        } else {
            return null;
        }
    }

}
