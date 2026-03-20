package airport.model;

public class Building {

    protected String name;

    public Building(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Building{name='" + name + "'}";
    }
}
