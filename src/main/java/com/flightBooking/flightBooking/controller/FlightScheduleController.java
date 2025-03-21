package com.flightBooking.flightBooking.controller;

import com.flightBooking.flightBooking.services.FlightSchedule;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/flightSchedule")
public class FlightScheduleController {
    private Map<String, FlightSchedule> scheduleMap = new HashMap<>();

    @GetMapping
    public Map getAll(){
        return scheduleMap;
    }


    @PostMapping
    public String createSchedule(@RequestBody FlightSchedule newSchedule) {
        scheduleMap.put(newSchedule.getId(), newSchedule);
        return "Schedule ho gaya!";
    }

    @GetMapping("id/{myId}")
    public FlightSchedule getScheduleById(@PathVariable String myId) {
        return scheduleMap.get(myId);
    }

}
