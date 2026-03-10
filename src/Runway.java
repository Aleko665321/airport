public class Runway {

    private String runwayNumber;
    private double length; // in meters
    private boolean isAvailable;

    // Constructor
    public Runway(String runwayNumber, double length) {
        this.runwayNumber = runwayNumber;
        this.length = length;
        this.isAvailable = true;
    }

    // Getters and Setters
    public String getRunwayNumber() {
        return runwayNumber;
    }

    public void setRunwayNumber(String runwayNumber) {
        this.runwayNumber = runwayNumber;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Business method: use runway
    public void useRunway() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Runway " + runwayNumber + " is now in use.");
        } else {
            System.out.println("Runway " + runwayNumber + " is currently occupied.");
        }
    }


}