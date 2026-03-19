package airport.model;

public class passenger {

    private String name;
    private ticket ticket;

    public passenger(String name, ticket ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public ticket getTicket() {
        return ticket;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTicket(ticket ticket) {
        this.ticket = ticket;
    }
}