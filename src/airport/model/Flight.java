package airport.model;

import java.time.LocalDateTime;

public class flight {

    private String destination;
    private LocalDateTime departureTime;
    private passenger[] passengers;
    private crewmember[] crew;

    public flight(String destination, LocalDateTime departureTime, passenger[] passengers, crewmember[] crew) {
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

    public passenger[] getPassengers() {
        return passengers;
    }

    public crewmember[] getCrew() {
        return crew;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setPassengers(passenger[] passengers) {
        this.passengers = passengers;
    }

    public void setCrew(crewmember[] crew) {
        this.crew = crew;
    }
}