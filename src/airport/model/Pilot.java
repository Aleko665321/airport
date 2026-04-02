package airport.model;

import airport.model.Interfaces.Flyable;

public class Pilot extends CrewMember implements Flyable {

    private int experienceYears;

    public Pilot(String name, int experienceYears) {
        super(name, "Pilot");
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying the plane!");
    }
}