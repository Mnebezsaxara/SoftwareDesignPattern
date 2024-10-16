package task_2;

class TaxiOrder {
    public void createOrder() {
        System.out.println("Order has been created.");
    }

    public void cancelOrder() {
        System.out.println("Order has been canceled.");
    }

    public void changeDestination(String newDestination) {
        System.out.println("Destination has been changed to: " + newDestination);
    }
}