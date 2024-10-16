package task_4;

public class Main {
    public static void main(String[] args) {
        DispatcherMediator mediator = new DispatcherMediator();

        Client client = new Client(mediator, "Client1");
        Driver driver = new Driver(mediator, "Driver1");
        Dispatcher dispatcher = new Dispatcher(mediator, "Dispatcher1");

        mediator.setClient(client);
        mediator.setDriver(driver);
        mediator.setDispatcher(dispatcher);

        client.send("I need a ride.");
        driver.send("I am on my way.");
        dispatcher.send("The ride is confirmed.");
    }
}