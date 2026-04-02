package airport.model;

import java.util.*;

public class Airport {

    private String name;
    private Terminal[] terminals;
    private Airline airline;

    private List<Flight> flights = new ArrayList<>();
    private Set<Passenger> passengers = new HashSet<>();
    private Map<Integer, Flight> flightMap = new HashMap<>();


    public Airport(String name, Terminal[] terminals, Airline airline) {
        this.name = name;
        this.terminals = terminals;
        this.airline = airline;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public Set<Passenger> getPassengers() {
        return passengers;
    }

    public Map<Integer, Flight> getFlightMap() {
        return flightMap;
    }




    public void addFlight(Flight flight) {
        flights.add(flight);
        flightMap.put(flight.getId(), flight);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void removeFlight(Flight flight) {
        flights.remove(flight);
        flightMap.remove(flight.getId());
    }


    public void demoCollectionMethods() {

        // List methods
        System.out.println("Flights size: " + flights.size()); // size
        if (!flights.isEmpty()) { // isEmpty
            System.out.println("First flight: " + flights.get(0)); // get
        }

        // Set
        System.out.println("Passengers size: " + passengers.size());

        // Map
        if (!flightMap.isEmpty()) {
            Integer firstKey = flightMap.keySet().iterator().next();
            System.out.println("First flight from map: " + flightMap.get(firstKey));
        }
    }


    public void iterateCollections() {

        // List
        for (Flight f : flights) {
            System.out.println("Flight: " + f);
        }

        // Set
        for (Passenger p : passengers) {
            System.out.println("Passenger: " + p);
        }

        // Map
        for (Map.Entry<Integer, Flight> entry : flightMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }



    public String getName() {
        return name;
    }

    public Terminal[] getTerminals() {
        return terminals;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTerminals(Terminal[] terminals) {
        this.terminals = terminals;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }
}
