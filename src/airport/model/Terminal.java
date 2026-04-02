package airport.model;
import airport.exceptions.TerminalCapacityExceededException;



public class Terminal extends Building {

    private String name;
    private Gate[] gates;
    private int capacity;
    private int currentPlanes;

    public Terminal(String name, Gate[] gates) {
        super(name);
        this.gates = gates;
        this.capacity = capacity;
        this.currentPlanes = 0;


    }

    public void addPlane() {
        if (currentPlanes >= capacity) {
            throw new TerminalCapacityExceededException("Terminal is full!");
        }
        currentPlanes++;
    }

    public String getName() {
        return name;
    }

    public Gate[] getGates() {
        return gates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGates(Gate[] gates) {
        this.gates = gates;
    }
}