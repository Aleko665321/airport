package airport.model;

public class Passenger extends Person {

    private Ticket ticket;

    public Passenger(String name, Ticket ticket) {
        super(name);
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String getRole() {
        return "Passenger";
    }

    @Override
    public String toString() {
        return "Passenger{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        Passenger that = (Passenger) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}