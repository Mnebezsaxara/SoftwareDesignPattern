package task_2;

class ChangeDestinationCommand implements Command {
    private TaxiOrder order;
    private String newDestination;

    public ChangeDestinationCommand(TaxiOrder order, String newDestination) {
        this.order = order;
        this.newDestination = newDestination;
    }

    @Override
    public void execute() {
        order.changeDestination(newDestination);
    }
}