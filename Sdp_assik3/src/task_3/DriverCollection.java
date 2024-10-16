package task_3;
import java.util.ArrayList;
import java.util.List;

class DriverCollection {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public DriverIterator iterator() {
        return new DriverIterator(drivers);
    }
}