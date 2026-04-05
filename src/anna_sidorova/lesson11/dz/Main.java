package anna_sidorova.lesson11.dz;

import anna_sidorova.lesson11.dz.model.order.Order;
import anna_sidorova.lesson11.dz.model.product.DigitalProduct;
import anna_sidorova.lesson11.dz.model.product.PhysicalProduct;
import anna_sidorova.lesson11.dz.model.product.Product;
import anna_sidorova.lesson11.dz.model.user.User;
import anna_sidorova.lesson11.dz.service.OrderService;
import anna_sidorova.lesson11.dz.service.PaymentStrategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User(2, 346.2, "Senya");
        User user1 = new User(1, 455678.8, "Vasya");
        Product product = new PhysicalProduct(455, "одеяло", 3455.4, 1.6);
        Product product1 = new PhysicalProduct(4, "кастрюля", 34.4, 3.6);
        Product product2 = new DigitalProduct(1, "телефон", 12345, 0.3);
        List<Product> products = List.of(product2, product1, product);
        Order order = new Order(user, products);
        OrderService service = new OrderService();
        PaymentStrategy payment = new BalancePayment();
        service.checkout(order, payment);
    }
}
