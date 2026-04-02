package airport.model;

import airport.model.Interfaces.Bookable;
import airport.model.Interfaces.Loadable;
import airport.exceptions.InvalidFlightException;
import airport.annotation.Loggable;

import java.time.LocalDateTime;

public class Flight extends Transport implements Bookable, Loadable {

    private int id;
    private LocalDateTime departureTime;
    private Passenger[] passengers;
    private CrewMember[] crew;

    public static int totalFlights;

    static {
        totalFlights = 0;
        System.out.println("Flight class loaded, totalFlights initialized!");
    }

    {
        System.out.println("A new Flight object is being created!");
    }

    public Flight(int id, String destination, LocalDateTime departureTime,
                  Passenger[] passengers, CrewMember[] crew) throws InvalidFlightException {
        super(destination);

        if (destination == null || destination.isEmpty()) {
            throw new InvalidFlightException("Destination cannot be empty");
        }

        if (departureTime == null) {
            throw new InvalidFlightException("Departure time cannot be null");
        }

        this.id = id;
        this.departureTime = departureTime;
        this.passengers = passengers;
        this.crew = crew;
        totalFlights++;
    }

    public int getId() {
        return id;
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

    public static void printTotalFlights() {
        System.out.println("Total flights created: " + totalFlights);
    }

    @Loggable
    public void printFlightInfo() {
        System.out.println("Flight to " + destination + " with " + passengers.length + " passengers.");
    }

    @Override
    public String toString() {
        return "Flight{id=" + id + ", destination='" + destination + "', departureTime=" + departureTime + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight that = (Flight) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public void book() {
        System.out.println("Flight to " + destination + " booked!");
    }

    @Override
    public void load() {
        System.out.println("Loading passengers and crew onto flight to " + destination);
    }


}
