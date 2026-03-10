import java.time.LocalDateTime;


public class AirportApp {
    public static void main(String[] args) {

        // 1️⃣ Create Terminals
        Terminal terminal1 = new Terminal(1, "A1", "A2", "A3");
        Terminal terminal2 = new Terminal(2, "B1", "B2", "B3");

        // 2️⃣ Create Runways
        Runway runway1 = new Runway("RW01", 3500);
        Runway runway2 = new Runway("RW02", 4000);

        // 3️⃣ Create Aircraft
        Aircraft aircraft1 = new Aircraft("Boeing 737", 180);
        Aircraft aircraft2 = new Aircraft("Airbus A320", 150);

        // 4️⃣ Create Seats (no arrays, just individual seats)
        Seats seat1 = new Seats("1A");
        Seats seat2 = new Seats("1B");
        Seats seat3 = new Seats("2A");
        Seats seat4 = new Seats("2B");



        // 5️⃣ Create Flights
        Flight flight1 = new Flight("BA123", "London", LocalDateTime.of(2026,3,15,10,30), LocalDateTime.of(2026,3,15,14,30), aircraft1, seat1, seat2);
        Flight flight2 = new Flight("AA456", "New York", LocalDateTime.of(2026,3,16,15,0), LocalDateTime.of(2026,3,16,23,0), aircraft2, seat3, seat4);

        // 6️⃣ Create Airlines
        Airline airline1 = new Airline("British Airways", flight1);
        Airline airline2 = new Airline("American Airlines", flight2);

        // 7️⃣ Create Passengers
        Passenger passenger1 = new Passenger("Aleko Kakhidze", "AA123456");
        Passenger passenger2 = new Passenger("Nino Beridze", "BB654321");

        // 9️⃣ Create BookingService
        BookingService bookingService = new BookingService();

        // 10️⃣ Create Airport and assign Terminals, Runways, Airlines
        Airport airport = new Airport("Tbilisi International", "Tbilisi");
        airport.setTerminals(terminal1, terminal2);
        airport.setRunways(runway1, runway2);
        airport.setAirlines(airline1, airline2);

        // 🛫 Book some seats
        bookingService.book(passenger1, flight1, seat1);
        bookingService.book(passenger2, flight2, seat2);
    }
}