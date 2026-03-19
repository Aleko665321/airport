package airport.model;

public class airport {

    private String name;
    private terminal[] terminals;
    private airline airline;

    public airport(String name, terminal[] terminals, airline airline) {
        this.name = name;
        this.terminals = terminals;
        this.airline = airline;
    }

    public String getName() {
        return name;
    }


    public terminal[] getTerminals() {
        return terminals;
    }

    public airline getAirline() {
        return airline;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTerminals(terminal[] terminals) {
        this.terminals = terminals;
    }

    public void setAirline(airline airline) {
        this.airline = airline;
    }
}