package airport.model;

public class flightattendant extends crewmember {

    private String language;

    public flightattendant(String name, String language) {
        super(name);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}