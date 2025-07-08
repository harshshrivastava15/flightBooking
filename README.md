# Airline Management System

A simple Airline Management System built using Spring Boot and MySQL.

## Features

- View all flight schedules.
- Get flight details by ID.
- Book a ticket (with flight association).
- View ticket details by ticket ID.
- Cancel a booked ticket.
- Data is persisted using MySQL and managed via Spring Data JPA.

## Database

- Two tables: `flight_schedule` and `user_tickets`.
- `user_tickets` has a foreign key reference to `flight_schedule`.

## Endpoints

### Flights

| Endpoint                            | Method | Description                          |
|------------------------------------|--------|--------------------------------------|
| `/flightSchedule?sort=asc/desc`    | GET    | Get all flight schedules (sorted)    |
| `/flightSchedule/id/{id}`          | GET    | Get flight schedule by ID            |
| `/flightSchedule`                  | POST   | Create a new flight schedule         |

### Tickets

| Endpoint                              | Method | Description                        |
|--------------------------------------|--------|------------------------------------|
| `/ticket/book`                       | POST   | Book a new ticket (linked to flight)|
| `/ticket/TicketId/{ticketId}`        | GET    | Get ticket details by ticket ID    |
| `/ticket/cancel/{ticketId}`          | DELETE | Cancel a ticket by ticket ID       |

## Tools & Technologies

- Spring Boot
- Spring Data JPA
- MySQL
- Java 17
- REST API

## Setup

1. Make sure MySQL is installed and running.
2. Create a database named `airline_db`.
3. Update your `application.properties` with your MySQL username and password.
4. Run the application using:

```bash
./mvnw spring-boot:run
