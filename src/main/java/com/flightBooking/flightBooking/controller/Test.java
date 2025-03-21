package com.flightBooking.flightBooking.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/Test")
    public String testing(){
        return "ok sab changa si";
    }
}
