package task_2;

class CreateOrderCommand implements Command {
    private TaxiOrder order;

    public CreateOrderCommand(TaxiOrder order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.createOrder();
    }
}