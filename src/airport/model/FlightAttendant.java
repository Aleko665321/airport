package airport.model;

public class FlightAttendant extends CrewMember {

    private String language;

    public FlightAttendant(String name, String language) {
        super(name, "FlightAttendant");
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}