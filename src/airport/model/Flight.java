package airport.model;

import java.time.LocalDateTime;

public class Flight extends Transport {

    private LocalDateTime departureTime;
    private Passenger[] passengers;
    private CrewMember[] crew;

    public Flight(String destination, LocalDateTime departureTime, Passenger[] passengers, CrewMember[] crew) {
        super(destination);
        this.departureTime = departureTime;
        this.passengers = passengers;
        this.crew = crew;
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

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public void setCrew(CrewMember[] crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "Flight{destination='" + destination + "', departureTime=" + departureTime + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight that = (Flight) o;
        return destination.equals(that.destination);
    }

    @Override
    public int hashCode() {
        return destination.hashCode();
    }
}