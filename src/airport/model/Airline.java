package airport.model;

public class Airline extends Company {

    private String name;

    public Airline(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}