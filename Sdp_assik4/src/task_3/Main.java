package task_3;

// Интерфейс PricingStrategy (Стратегия ценообразования)
interface PricingStrategy {
    double calculateFare(double value);
}

// Стратегия расчета по расстоянию
class DistancePricingStrategy implements PricingStrategy {
    private final double pricePerKm;

    public DistancePricingStrategy(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * pricePerKm;
    }
}

// Стратегия расчета по времени
class TimePricingStrategy implements PricingStrategy {
    private final double pricePerMinute;

    public TimePricingStrategy(double pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public double calculateFare(double timeInMinutes) {
        return timeInMinutes * pricePerMinute;
    }
}

// Стратегия фиксированной цены
class FixedPriceStrategy implements PricingStrategy {
    private final double fixedPrice;

    public FixedPriceStrategy(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    @Override
    public double calculateFare(double notUsed) {
        return fixedPrice;
    }
}

// Класс для расчета стоимости поездки с использованием выбранной стратегии
class TaxiFareCalculator {
    private PricingStrategy strategy;

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateFare(double value) {
        return strategy.calculateFare(value);
    }
}

public class Main {
    public static void main(String[] args) {
        TaxiFareCalculator calculator = new TaxiFareCalculator();

        calculator.setStrategy(new DistancePricingStrategy(10));
        double fareByDistance = calculator.calculateFare(15);
        System.out.println("Fare by distance: " + fareByDistance);

        calculator.setStrategy(new TimePricingStrategy(2));
        double fareByTime = calculator.calculateFare(30);
        System.out.println("Fare by time: " + fareByTime);

        calculator.setStrategy(new FixedPriceStrategy(100));
        double fixedFare = calculator.calculateFare(0);
        System.out.println("Fixed fare: " + fixedFare);
    }
}
