package task_5;

public class Main {
    public static void main(String[] args) {
        Factory standardFactory = new StandardFactory();
        Taxi standardTaxi = standardFactory.createTaxi("XYZ12345");
        standardTaxi.takePassenger("Narek");

        Factory premiumFactory = new PremiumFactory();
        Taxi premiumTaxi = premiumFactory.createTaxi("XYZ67890");
        premiumTaxi.takePassenger("Tyson");
    }
}