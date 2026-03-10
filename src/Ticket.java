import java.math.BigDecimal;

public class Ticket {

    private Passenger passenger;
    private Flight flight;
    private Seats seats;
    private BigDecimal price; // use BigDecimal instead of double

    // Constructor
    public Ticket(Passenger passenger, Flight flight, Seats seats, boolean price) {
        this.passenger = passenger;
        this.flight = flight;
        this.seats = seats;
        this.price = price;
    }

    // Getters and setters
    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // Optional: print ticket info
    public void printTicket() {
        System.out.println("Ticket for " + passenger.getName() +
                " | Flight: " + flight.getFlightNumber() +
                " | Seat: " + seats.getSeatNumber() +
                " | Price: $" + price);
    }

    // Optional: apply discount
    public void applyDiscount(BigDecimal discountPercentage) {
        BigDecimal discountAmount = price.multiply(discountPercentage).divide(new BigDecimal("100"));
        price = price.subtract(discountAmount);
    }
}