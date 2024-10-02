package task_5;


public abstract class Factory {
    public abstract Taxi createTaxi(String license);
    public abstract Driver createDriver(String name);
}