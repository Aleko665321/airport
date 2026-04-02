package airport.exceptions;

public class BaggageOverweightException extends RuntimeException {
    public BaggageOverweightException(String message) {
        super(message);
    }
}