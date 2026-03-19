package airport.model;

public class Gate {

    private String gateNumber;
    private Flight flight;

    public Gate(String gateNumber, Flight flight) {
        this.gateNumber = gateNumber;
        this.flight = flight;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}