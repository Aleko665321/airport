package airport.enums;

public enum TerminalType {
    DOMESTIC(100),
    INTERNATIONAL(200);

    private int capacity;

    TerminalType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
