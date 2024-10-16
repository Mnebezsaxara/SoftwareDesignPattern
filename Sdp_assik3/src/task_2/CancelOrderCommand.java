package task_2;

class CancelOrderCommand implements Command {
    private TaxiOrder order;

    public CancelOrderCommand(TaxiOrder order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.cancelOrder();
    }
}