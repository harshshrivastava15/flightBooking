package com.flightBooking.flightBooking.repository;

import com.flightBooking.flightBooking.entity.FlightSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightScheduleRepository extends JpaRepository<FlightSchedule, Long> {
}

