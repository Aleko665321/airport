package airport.model;

import java.math.BigDecimal;

public class Ticket {

    private String seatNumber;
    private BigDecimal price;

    public Ticket(String seatNumber, BigDecimal price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{seat='" + seatNumber + "', price=" + price + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;

        Ticket that = (Ticket) o;
        return seatNumber.equals(that.seatNumber);
    }

    @Override
    public int hashCode() {
        return seatNumber.hashCode();
    }
}