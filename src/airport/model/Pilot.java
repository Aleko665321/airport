package airport.model;

public class pilot extends crewmember {

    private int experienceYears;

    public pilot(String name, int experienceYears) {
        super(name);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}