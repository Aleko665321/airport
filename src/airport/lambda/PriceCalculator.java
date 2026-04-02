package airport.lambda;

@FunctionalInterface
public interface PriceCalculator {
    double calculate(double basePrice);
}
