public class Driver {
    private String name;
    private Car car;

    public Driver(String name) {
        this.name = name;
    }

    public void addCar(Car car) {
        this.car = car;
        System.out.println(name + " has added the car: " + car.getModel());
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }
}
