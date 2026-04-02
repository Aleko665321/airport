package airport.enums;

public enum TicketClass {
    ECONOMY(1.0),
    BUSINESS(1.5),
    FIRST_CLASS(2.0);

    private double priceMultiplier;

    TicketClass(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }
}
