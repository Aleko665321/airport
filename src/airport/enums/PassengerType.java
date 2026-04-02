package airport.enums;

public enum PassengerType {
    REGULAR(0),
    VIP(1),
    CHILD(2);

    private int priority;

    PassengerType(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isVip() {
        return this == VIP;
    }
}
