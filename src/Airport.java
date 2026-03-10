import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Airport {
    private String name;
    private String city;
    private List<Terminal> terminals;   // store terminals
    private List<Runway> runways;
    private List<Airline> airlines;

    public Airport(String name, String city) {
        this.name = name;
        this.city = city;
        this.terminals = new ArrayList<>();
        this.runways = new ArrayList<>();
        this.airlines = new ArrayList<>();
    }

    // ✅ setTerminals with varargs
    public void setTerminals(Terminal... terminals) {
        this.terminals.addAll(Arrays.asList(terminals));
    }

    // Similarly for runways and airlines
    public void setRunways(Runway... runways) {
        this.runways.addAll(Arrays.asList(runways));
    }

    public void setAirlines(Airline... airlines) {
        this.airlines.addAll(Arrays.asList(airlines));
    }
}