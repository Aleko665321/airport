package airport.exceptions;

public class TerminalCapacityExceededException extends RuntimeException {
    public TerminalCapacityExceededException(String message) {
        super(message);
    }
}