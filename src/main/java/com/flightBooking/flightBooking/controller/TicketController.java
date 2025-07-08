package com.flightBooking.flightBooking.controller;

import com.flightBooking.flightBooking.entity.UserTickets;
import com.flightBooking.flightBooking.repository.UserTicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private UserTicketsRepository ticketRepo;

    @PostMapping("/book")
    public String bookTicket(@RequestBody UserTickets ticket) {
        ticketRepo.save(ticket);
        return "Ticket booked!";
    }

    @GetMapping("/TicketId/{ticketId}")
    public UserTickets getTicketDetails(@PathVariable Long ticketId) {
        return ticketRepo.findById(ticketId).orElse(null);
    }

    @DeleteMapping("/cancel/{ticketId}")
    public String cancelTicket(@PathVariable Long ticketId) {
        if (ticketRepo.existsById(ticketId)) {
            ticketRepo.deleteById(ticketId);
            return "Ticket cancelled!";
        }
        return "Ticket not found!";
    }
}
