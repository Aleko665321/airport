package airport.model;

public class terminal {

    private String name;
    private gate[] gates;

    public terminal(String name, gate[] gates) {
        this.name = name;
        this.gates = gates;
    }

    public String getName() {
        return name;
    }

    public gate[] getGates() {
        return gates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGates(gate[] gates) {
        this.gates = gates;
    }
}