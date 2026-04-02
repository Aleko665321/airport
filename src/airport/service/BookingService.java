package airport.service;

import airport.model.Passenger;
import airport.model.Person;
import airport.model.Ticket;
import airport.exceptions.NoAvailableSeatsException;


public class BookingService {

    private static int bookingCount;
    private static int availableSeats = 2;

    static {
        bookingCount = 0;
        System.out.println("BookingService initialized");
    }

    public static void bookSeat(Passenger passenger, Ticket ticket) {
         if (availableSeats <= 0) {
            throw new NoAvailableSeatsException("No seats available!");
        }

        bookingCount++;
        availableSeats--;

        System.out.println("Booking for: " + passenger.getName());
        System.out.println("Seat: " + ticket.getSeatNumber());
        System.out.println("Price: " + ticket.getPrice());
        System.out.println("Email sent!");

        try {
            BookingService.bookSeat(passenger, ticket);
        } catch (NoAvailableSeatsException e) {
            System.out.println("Booking error: " + e.getMessage());
        }

    }

    public static int getBookingCount() {
        return bookingCount;
    }

    public static void printPersonRole(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Role: " + person.getRole());
    }
}