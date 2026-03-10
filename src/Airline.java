public class Airline {
    private String airlineName;
    private String country;

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Airline(String airlineName, Flight country) {
        this.airlineName = airlineName;
    }
}
