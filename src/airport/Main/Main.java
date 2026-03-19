package airport.Main;

import airport.model.*;
import airport.BookingService.BookingService;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        Ticket ticket = new Ticket("12A", new BigDecimal("199.99"));
        Passenger passenger = new Passenger("Aleko", ticket);

        Pilot pilot = new Pilot("John", 10);
        FlightAttendant attendant = new FlightAttendant("Anna", "English");

        CrewMember[] crew = {pilot, attendant};
        Passenger[] passengers = {passenger};

        Flight flight = new Flight(
                "Paris",
                LocalDateTime.now().plusDays(1),
                passengers,
                crew
        );

        Gate gate = new Gate("G1", flight);
        Gate[] gates = {gate};

        Terminal terminal = new Terminal("T1", gates);
        Terminal[] terminals = {terminal};

        Airline airline = new Airline("Air Georgia");

        Airport airport = new Airport("Tbilisi Airport", terminals, airline);

        BookingService.bookSeat(passenger, ticket);

        System.out.println("Total bookings: " + BookingService.getBookingCount());
    }
}