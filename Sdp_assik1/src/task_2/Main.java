package task_2;


public class Main {
    public static void main(String[] args) {
        Driver originalDriver = new Driver("Lionel Messi", "BMW", "BMW motors", "35");

        Driver clonedDriver = originalDriver.clone();

        clonedDriver.setName("Cristiano Ronaldo");
        clonedDriver.setCarModel("Porche 911");

        System.out.println("Original Driver: " + originalDriver.getName() + ", Car: " + originalDriver.getCarModel());
        System.out.println("Cloned Driver: " + clonedDriver.getName() + ", Car: " + clonedDriver.getCarModel());
    }
}