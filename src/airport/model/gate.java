package airport.model;

public class gate {

    private String gateNumber;
    private flight flight;

    public gate(String gateNumber, flight flight) {
        this.gateNumber = gateNumber;
        this.flight = flight;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public flight getFlight() {
        return flight;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public void setFlight(flight flight) {
        this.flight = flight;
    }
}