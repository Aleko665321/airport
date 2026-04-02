package airport.lambda;

import airport.model.Flight;

@FunctionalInterface
public interface FlightOperation {
    void execute(Flight flight);
}
