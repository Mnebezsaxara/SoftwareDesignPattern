package task_3;

public class Main {
    public static void main(String[] args) {
        DriverCollection driverCollection = new DriverCollection();

        driverCollection.addDriver(new Driver("Erkin", 5));
        driverCollection.addDriver(new Driver("Dias", 3));
        driverCollection.addDriver(new Driver("Aitas", 7));

        DriverIterator iterator = driverCollection.iterator();
        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println("Driver: " + driver.getName() + ", Distance: " + driver.getDistanceToClient());
        }
    }
}