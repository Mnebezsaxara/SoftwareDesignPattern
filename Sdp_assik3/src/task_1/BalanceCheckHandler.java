package task_1;

class BalanceCheckHandler extends Handler {
    @Override
    public void handleRequest(ClientRequest request) {
        if (request.hasEnoughBalance) {
            System.out.println("Balance is sufficient. Proceeding...");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}