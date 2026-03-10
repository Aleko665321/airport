public class BookingService {
    public void bookSeat(Passenger passenger, Flight flight) {
        System.out.println("Booking seat for passenger: " + passenger.getName());
        System.out.println("Passport number: " + passenger.getPassportNumber());
        System.out.println("Flight number: " + flight.getFlightNumber());
        System.out.println("Destination: " + flight.getDestination());
    }

    public void book(Passenger passenger, Flight flight, Seats seat) {
        // Check if the seat is available
        if (seat.isAvailable()) {
            seat.setAvailable(false); // mark the seat as booked

            // Create a ticket for this booking
            Ticket ticket = new Ticket(passenger, flight, seat, flight.getPrice());

            // Optionally, store the ticket somewhere (like a list of booked tickets)
            System.out.println("Booking successful: " + passenger.getName() +
                    " booked seat " + seat.getSeatNumber() +
                    " on flight " + flight.getFlightNumber());
        } else {
            System.out.println("Seat " + seat.getSeatNumber() + " is already booked!");
        }
    }
}
