package veranika_slesarchyk.lesson11_collections_part1.HW;

import veranika_slesarchyk.lesson11_collections_part1.HW.exception.InsufficientBalanceException;
import veranika_slesarchyk.lesson11_collections_part1.HW.model.*;
import veranika_slesarchyk.lesson11_collections_part1.HW.payment.BalancePayment;
import veranika_slesarchyk.lesson11_collections_part1.HW.payment.PaymentStrategy;
import veranika_slesarchyk.lesson11_collections_part1.HW.service.OrderService;

public class Main {
    public static void main(String[] args) {
    User user = new User(1, 150, "Alex");
    Product p1 = new PhysicalProduct(1, "Laptop", 50, 5);
    Product p2 = new DigitalProduct(2, "Game", 20, 10);

    Order order = new Order(user);
        order.addProduct(p1);
        order.addProduct(p2);

    OrderService service = new OrderService();
    PaymentStrategy payment = new BalancePayment();

        try {
        service.checkout(order, payment);
        System.out.println("Остаток: " + user.getBalance());
    } catch (InsufficientBalanceException e) {
        System.out.println(e.getMessage());
    }
}
}

