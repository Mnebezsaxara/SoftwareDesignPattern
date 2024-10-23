package task_2;

// Интерфейс State (Состояние)
interface State {
    void next(TaxiOrder order);
    void prev(TaxiOrder order);
    void printStatus();
}

// Класс TaxiOrder
class TaxiOrder {
    private State state;

    public TaxiOrder() {
        this.state = new CreatedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void prevState() {
        state.prev(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}

// Состояние CreatedState
class CreatedState implements State {

    @Override
    public void next(TaxiOrder order) {
        order.setState(new ConfirmedState());
    }

    @Override
    public void prev(TaxiOrder order) {
        System.out.println("The order is in its initial state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order has been created.");
    }
}

// Состояние ConfirmedState
class ConfirmedState implements State {

    @Override
    public void next(TaxiOrder order) {
        order.setState(new OnTheWayState());
    }

    @Override
    public void prev(TaxiOrder order) {
        order.setState(new CreatedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order has been confirmed.");
    }
}

// Состояние OnTheWayState
class OnTheWayState implements State {

    @Override
    public void next(TaxiOrder order) {
        order.setState(new FinishedState());
    }

    @Override
    public void prev(TaxiOrder order) {
        order.setState(new ConfirmedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Taxi is on the way.");
    }
}

// Состояние FinishedState
class FinishedState implements State {

    @Override
    public void next(TaxiOrder order) {
        System.out.println("The order is already completed.");
    }

    @Override
    public void prev(TaxiOrder order) {
        order.setState(new OnTheWayState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order has been completed.");
    }
}


public class Main {
    public static void main(String[] args) {
        TaxiOrder order = new TaxiOrder();

        order.printStatus();
        order.nextState();
        order.printStatus();
        order.nextState();
        order.printStatus();
        order.nextState();
        order.printStatus();

        order.prevState();
        order.printStatus();
        order.prevState();
        order.printStatus();
    }
}
