package airport.enums;

public enum CrewRole {
    PILOT("Fly plane"),
    ATTENDANT("Assist passengers");

    private String responsibility;

    CrewRole(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getResponsibility() {
        return responsibility;
    }
}
