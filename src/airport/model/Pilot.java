package airport.model;

public class Pilot extends CrewMember {

    private int experienceYears;

    public Pilot(String name, int experienceYears) {
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