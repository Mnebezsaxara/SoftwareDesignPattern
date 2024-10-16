package task_1;

class CarSendHandler extends Handler {
    @Override
    public void handleRequest(ClientRequest request) {
        if (request.canSendCar) {
            System.out.println("Car can be sent to the location.");
        } else {
            System.out.println("Car cannot be sent to the specified location.");
        }
    }
}