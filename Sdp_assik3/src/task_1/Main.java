package task_1;

public class Main {
    public static void main(String[] args) {
        Handler carAvailabilityHandler = new CarAvailabilityHandler();
        Handler balanceCheckHandler = new BalanceCheckHandler();
        Handler carSendHandler = new CarSendHandler();

        carAvailabilityHandler.setNextHandler(balanceCheckHandler);
        balanceCheckHandler.setNextHandler(carSendHandler);

        ClientRequest request = new ClientRequest(true, true, true);

        carAvailabilityHandler.handleRequest(request);
    }
}