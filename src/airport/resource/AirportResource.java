package airport.resource;

public class AirportResource implements AutoCloseable {

    public void open() {
        System.out.println("Resource opened");
    }

    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}
