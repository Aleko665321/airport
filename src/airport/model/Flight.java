package airport.model;

import java.time.LocalDateTime;

public class Flight {

    private String destination;
    private LocalDateTime departureTime;
    private Passenger[] passengers;
    private CrewMember[] crew;

    public Flight(String destination, LocalDateTime departureTime, Passenger[] passengers, CrewMember[] crew) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.passengers = passengers;
        this.crew = crew;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public CrewMember[] getCrew() {
        return crew;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public void setCrew(CrewMember[] crew) {
        this.crew = crew;
    }
}