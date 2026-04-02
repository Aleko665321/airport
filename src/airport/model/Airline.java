package airport.model;

import airport.model.Interfaces.Maintanable;
import airport.model.Interfaces.Payable;

import java.math.BigDecimal;

public class Airline extends Company implements Maintanable, Payable {

    private Terminal[] terminals;
    private BigDecimal budget;
    private int fleetSize;
    private String country;

    public Airline(String name, Terminal[] terminals, BigDecimal budget, int fleetSize, String country) {
        super(name); // call Company constructor
        this.terminals = terminals;
        this.budget = budget;
        this.fleetSize = fleetSize;
        this.country = country;
    }

    public Terminal[] getTerminals() {
        return terminals;
    }

    public void setTerminals(Terminal[] terminals) {
        this.terminals = terminals;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
    }

    public int getFleetSize() {
        return fleetSize;
    }

    public void setFleetSize(int fleetSize) {
        this.fleetSize = fleetSize;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Airline{name='" + name + "', country='" + country + "', fleetSize=" + fleetSize + ", terminals=" + terminals.length + ", budget=" + budget + "}";
    }

    @Override
    public void maintain() {
        System.out.println("Maintaining airline " + name);
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Paying " + amount + " for airline " + name);
    }
}