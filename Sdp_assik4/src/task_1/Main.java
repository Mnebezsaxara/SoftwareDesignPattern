package task_1;
import java.util.ArrayList;
import java.util.List;

// Интерфейс Observer
interface Observer {
    void update(String status);
}

// Интерфейс Subject
interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}

// Класс Order (Subject)
class Order implements Subject {
    private List<Observer> observers;
    private String status;

    public Order() {
        this.observers = new ArrayList<>();
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}

// Класс Client (Observer)
class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println("Client " + name + " notified: Order status changed to: " + status);
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Client client1 = new Client("Erkin");
        Client client2 = new Client("Nursultan");

        order.subscribe(client1);
        order.subscribe(client2);

        order.setStatus("Taxi is approaching");
        order.setStatus("Order completed");


        order.unsubscribe(client1);

        order.setStatus("Taxi has arrived");
    }
}
