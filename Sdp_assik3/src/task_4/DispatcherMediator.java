package task_4;

class DispatcherMediator implements Mediator {
    private Client client;
    private Driver driver;
    private Dispatcher dispatcher;

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void sendMessage(String message, User user) {
        if (user == client) {
            driver.receive(message);
            dispatcher.receive(message);
        } else if (user == driver) {
            client.receive(message);
            dispatcher.receive(message);
        } else if (user == dispatcher) {
            client.receive(message);
            driver.receive(message);
        }
    }
}
