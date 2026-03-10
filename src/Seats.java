import java.util.List;

public class Seats {

    private String seatNumber;
    private boolean isOccupied;
    private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Seats(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isOccupied = false;
    }

    public void setAvailable(boolean b) {
        this.available = b;
    }


}