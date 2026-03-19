package airport.model;

public class Terminal {

    private String name;
    private Gate[] gates;

    public Terminal(String name, Gate[] gates) {
        this.name = name;
        this.gates = gates;
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