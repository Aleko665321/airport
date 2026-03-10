import java.time.LocalDateTime;

public class Flight {

    private String flightNumber;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Aircraft aircraft;
    private Seats seat1;
    private Seats seat2;

    // Constructor
    public Flight(String flightNumber, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime,
                  Aircraft aircraft, Seats seat1, Seats seat2) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
        this.seat1 = seat1;
        this.seat2 = seat2;
    }

    // Getters and Setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Seats getSeat1() {
        return seat1;
    }

    public void setSeat1(Seats seat1) {
        this.seat1 = seat1;
    }

    public Seats getSeat2() {
        return seat2;
    }

    public void setSeat2(Seats seat2) {
        this.seat2 = seat2;
    }


    public boolean getPrice() {
        // Sum the prices of the seats
        return seat1.getPrice().add(seat2.getPrice());
    }
}