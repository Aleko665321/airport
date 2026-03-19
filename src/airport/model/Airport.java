package airport.model;

public class Airport {

    private String name;
    private Terminal[] terminals;
    private Airline airline;

    public Airport(String name, Terminal[] terminals, Airline airline) {
        this.name = name;
        this.terminals = terminals;
        this.airline = airline;
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