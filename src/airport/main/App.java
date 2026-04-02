package airport.main;

import airport.model.*;
import airport.model.Interfaces.Bookable;
import airport.model.Interfaces.Flyable;
import airport.service.BookingService;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class App {

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

        Flyable f = pilot;
        f.fly();

        Bookable b = flight;
        b.book();

        Gate gate = new Gate("G1", flight);
        Gate[] gates = {gate};

        Terminal terminal = new Terminal("T1", gates);
        Terminal[] terminals = {terminal};

        Airline airline = new Airline("Air Georgia",  new Terminal[]{terminal},
                new BigDecimal("50000000"),
                20,
                "Georgia" );

        Airport airport = new Airport("Tbilisi Airport", terminals, airline);

        BookingService.bookSeat(passenger, ticket);

        System.out.println("Total bookings: " + BookingService.getBookingCount());
        System.out.println("Airport name: " + airport.getName());
    }
}