package task_2;

class Dispatcher {
    private Command createOrderCommand;
    private Command cancelOrderCommand;
    private Command changeDestinationCommand;

    public void setCreateOrderCommand(Command createOrderCommand) {
        this.createOrderCommand = createOrderCommand;
    }

    public void setCancelOrderCommand(Command cancelOrderCommand) {
        this.cancelOrderCommand = cancelOrderCommand;
    }

    public void setChangeDestinationCommand(Command changeDestinationCommand) {
        this.changeDestinationCommand = changeDestinationCommand;
    }

    public void createOrder() {
        createOrderCommand.execute();
    }

    public void cancelOrder() {
        cancelOrderCommand.execute();
    }

    public void changeDestination(String newDestination) {
        changeDestinationCommand.execute();
    }
}