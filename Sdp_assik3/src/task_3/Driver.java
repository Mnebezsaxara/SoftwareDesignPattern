package task_3;

class Driver {
    private String name;
    private int distanceToClient;

    public Driver(String name, int distanceToClient) {
        this.name = name;
        this.distanceToClient = distanceToClient;
    }

    public String getName() {
        return name;
    }

    public int getDistanceToClient() {
        return distanceToClient;
    }
}