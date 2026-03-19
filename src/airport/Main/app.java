package airport.Main;

import airport.model.*;
import airport.BookingService.BookingService;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class main {

    public static void main(String[] args) {

        ticket ticket = new ticket("12A", new BigDecimal("199.99"));
        passenger passenger = new passenger("Aleko", ticket);

        pilot pilot = new pilot("John", 10);
        flightattendant attendant = new flightattendant("Anna", "English");

        crewmember[] crew = {pilot, attendant};
        passenger[] passengers = {passenger};

        flight flight = new flight(
                "Paris",
                LocalDateTime.now().plusDays(1),
                passengers,
                crew
        );

        gate gate = new gate("G1", flight);
        gate[] gates = {gate};

        terminal terminal = new terminal("T1", gates);
        terminal[] terminals = {terminal};

        airline airline = new airline("Air Georgia");

        airport airport = new airport("Tbilisi Airport", terminals, airline);

        BookingService.bookSeat(passenger, ticket);

        System.out.println("Total bookings: " + BookingService.getBookingCount());
    }
}