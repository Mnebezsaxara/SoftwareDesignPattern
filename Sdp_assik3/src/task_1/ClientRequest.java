package task_1;

class ClientRequest {
    public boolean isCarAvailable;
    public boolean hasEnoughBalance;
    public boolean canSendCar;

    public ClientRequest(boolean isCarAvailable, boolean hasEnoughBalance, boolean canSendCar) {
        this.isCarAvailable = isCarAvailable;
        this.hasEnoughBalance = hasEnoughBalance;
        this.canSendCar = canSendCar;
    }
}
