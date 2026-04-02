package airport.model;

import airport.model.Interfaces.Bookable;
import airport.model.Interfaces.Loadable;

import java.awt.print.Book;
import java.time.LocalDateTime;

public class Flight extends Transport implements Bookable, Loadable {

    private LocalDateTime departureTime;
    private Passenger[] passengers;
    private CrewMember[] crew;


    public static int totalFlights;

    static { // static block
        totalFlights = 0;
        System.out.println("Flight class loaded, totalFlights initialized!");
    }

    {
        System.out.println("A new Flight object is being created!");
    }

    public Flight(String destination, LocalDateTime departureTime, Passenger[] passengers, CrewMember[] crew) {
        super(destination);
        this.departureTime = departureTime;
        this.passengers = passengers;
        this.crew = crew;
        totalFlights++;
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

    public static void printTotalFlights() { // static method
        System.out.println("Total flights created: " + totalFlights);
    }

    public void printFlightInfo() { // regular (instance) method
        System.out.println("Flight to " + destination + " with " + passengers.length + " passengers.");
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


    @Override
    public void book(){
        System.out.println("Flight to" + destination + "booked!");
    }

    @Override
    public void load() {
        System.out.println("Loading passengers and crew onto flight to " + destination);
    }
}