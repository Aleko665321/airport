package airport.model;

import airport.exceptions.BaggageOverweightException;

public class Baggage {

    private double weight; // in kg

    public Baggage(double weight) {
        if (weight > 23) { // airline standard
            throw new BaggageOverweightException("Baggage too heavy: " + weight + "kg");
        }
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 23) {
            throw new BaggageOverweightException("Baggage too heavy: " + weight + "kg");
        }
        this.weight = weight;
    }
}