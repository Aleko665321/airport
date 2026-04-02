package airport.exceptions;

public class InvalidTicketPriceException extends RuntimeException {
    public InvalidTicketPriceException(String message) {
        super(message);
    }
}