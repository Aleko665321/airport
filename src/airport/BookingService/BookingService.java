package airport.BookingService;

import airport.model.Passenger;
import airport.model.Ticket;

public class BookingService {

    private static int bookingCount;

    static {
        bookingCount = 0;
        System.out.println("BookingService initialized");
    }

    public static void bookSeat(Passenger passenger, Ticket ticket) {
        bookingCount++;

        System.out.println("Booking for: " + passenger.getName());
        System.out.println("Seat: " + ticket.getSeatNumber());
        System.out.println("Price: " + ticket.getPrice());
        System.out.println("Email sent!");
    }

    public static int getBookingCount() {
        return bookingCount;
    }
}