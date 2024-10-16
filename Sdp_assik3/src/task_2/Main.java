package task_2;

public class Main {
    public static void main(String[] args) {
        TaxiOrder order = new TaxiOrder();

        Command createOrder = new CreateOrderCommand(order);
        Command cancelOrder = new CancelOrderCommand(order);
        Command changeDestination = new ChangeDestinationCommand(order, "New Address");

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setCreateOrderCommand(createOrder);
        dispatcher.setCancelOrderCommand(cancelOrder);
        dispatcher.setChangeDestinationCommand(changeDestination);

        dispatcher.createOrder();
        dispatcher.changeDestination("New Destination");
        dispatcher.cancelOrder();
    }
}