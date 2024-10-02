package task_4;

public class Main {
    public static void main(String[] args) {
        Factory standardFactory = new StandardTaxiFactory();
        Taxi standardTaxi = standardFactory.createTaxi("Nurbek", "XYZ12345");
        standardTaxi.takePassenger("Donibek");

        Factory premiumFactory = new PremiumTaxiFactory();
        Taxi premiumTaxi = premiumFactory.createTaxi("Nurbek", "XYZ12345");
        premiumTaxi.takePassenger("Ansarbek");
    }
}