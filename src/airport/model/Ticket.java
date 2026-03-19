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
}