package airport.lambda;

import airport.model.Passenger;

@FunctionalInterface
public interface PassengerFilter {
    boolean test(Passenger passenger);
}
