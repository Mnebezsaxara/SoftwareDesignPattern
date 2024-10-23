package task_4;

// Абстрактный класс OrderProcess
abstract class OrderProcess {
    public final void processOrder() {
        checkAvailability();
        calculateCost();
        confirmOrder();
    }

    protected abstract void checkAvailability();

    protected void calculateCost() {
        System.out.println("Calculating cost of the ride...");
    }

    protected abstract void confirmOrder();
}

// Класс для стандартного процесса заказа такси
class StandardOrderProcess extends OrderProcess {
    @Override
    protected void checkAvailability() {
        System.out.println("Checking taxi availability for standard order...");
    }

    @Override
    protected void confirmOrder() {
        System.out.println("Order confirmed for standard taxi.");
    }
}

// Класс для VIP процесса заказа такси (например, с приоритетным обслуживанием)
class VIPOrderProcess extends OrderProcess {
    @Override
    protected void checkAvailability() {
        System.out.println("Checking VIP taxi availability with priority...");
    }

    @Override
    protected void confirmOrder() {
        System.out.println("Order confirmed for VIP taxi.");
    }
}


public class Main {
    public static void main(String[] args) {
        // Обработка стандартного заказа
        OrderProcess standardOrder = new StandardOrderProcess();
        standardOrder.processOrder();
        System.out.println();

        // Обработка VIP заказа
        OrderProcess vipOrder = new VIPOrderProcess();
        vipOrder.processOrder();
    }
}
