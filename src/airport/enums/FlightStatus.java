package airport.enums;

public enum FlightStatus {
    ON_TIME(1),
    DELAYED(2),
    CANCELLED(3);

    private int code;

    FlightStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public boolean isActive() {
        return this == ON_TIME;
    }
}
