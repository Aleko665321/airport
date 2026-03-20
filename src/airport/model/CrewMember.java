package airport.model;

public class CrewMember extends Person {

    protected String position;

    public CrewMember(String name, String position) {
        super(name);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String getRole() {
        return position;
    }


}