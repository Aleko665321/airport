package airport.model.finalclass;

import airport.model.Ticket;

public final class TicketValidator {
    public boolean validate(Ticket ticket) {
        return ticket != null && ticket.getSeatNumber() != null;
    }
}