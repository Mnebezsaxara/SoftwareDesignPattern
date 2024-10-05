public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Mansur");
        Car car = new Car("Mercedes");
        CarSharing carSharing = new CarSharing(car);

        // Используем адаптер для интерфейса TaxiService
        TaxiService taxiService = new CarSharingAdapter(carSharing);
        taxiService.requestTaxi(passenger);
    }
}
