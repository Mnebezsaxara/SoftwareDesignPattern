package task_1;

class CarAvailabilityHandler extends Handler {
    @Override
    public void handleRequest(ClientRequest request) {
        if (request.isCarAvailable) {
            System.out.println("Car is available. Proceeding...");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("No cars available.");
        }
    }
}