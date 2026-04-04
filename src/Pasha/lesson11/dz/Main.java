package Pasha.lesson11.dz;

import Pasha.lesson11.dz.model.order.Order;
import Pasha.lesson11.dz.model.product.DigitalProduct;
import Pasha.lesson11.dz.model.product.PhysicalProduct;
import Pasha.lesson11.dz.model.product.Product;
import Pasha.lesson11.dz.model.user.User;
import Pasha.lesson11.dz.payment.BalancePayment;
import Pasha.lesson11.dz.payment.PaymentStrategy;
import Pasha.lesson11.dz.service.OrderService;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "John Doe", 1500.0);

        Product laptop = new PhysicalProduct(101, "Laptop", 1000.0, 2.5); // 1000 + (2.5 * 2) = 1005.0
        Product eBook = new DigitalProduct(102, "Book reader", 300.0, 5.0); // 300.0
        Product phone = new PhysicalProduct(103, "Smartphone", 800.0, 0.5); // 800 + (0.5 * 2) = 801.0

        Order order = new Order(user);
        order.addProduct(laptop);
        order.addProduct(eBook);
//        order.addProduct(phone); ------------- when uncommented, exception is triggered.

        OrderService service = new OrderService();
        PaymentStrategy payment = new BalancePayment();

        service.checkout(order, payment);
    }
}
