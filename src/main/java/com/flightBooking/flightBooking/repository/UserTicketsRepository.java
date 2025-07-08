package com.flightBooking.flightBooking.repository;

import com.flightBooking.flightBooking.entity.UserTickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTicketsRepository extends JpaRepository<UserTickets, Long> {
}

