package airport.model;

public class Transport {
    protected String destination;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Transport(String destination) {
        this.destination = destination;
    }
}
