package roma_kinev.lesson_11.dz;

import roma_kinev.lesson_11.dz.model.DigitalProduct;
import roma_kinev.lesson_11.dz.model.Order;
import roma_kinev.lesson_11.dz.model.PhysicalProduct;
import roma_kinev.lesson_11.dz.model.User;
import roma_kinev.lesson_11.dz.payment.BalancePayment;
import roma_kinev.lesson_11.dz.payment.PaymentStrategy;
import roma_kinev.lesson_11.dz.service.OrderService;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, 2000, "User1");

        PhysicalProduct phone = new PhysicalProduct(1, "Phone", 500, 120);
        DigitalProduct ebook = new DigitalProduct(2, "Ebook", 350, 100);

        Order order = new Order(user);
        order.addProduct(phone);
        order.addProduct(ebook);

        OrderService service = new OrderService();
        PaymentStrategy paymant = new BalancePayment();
        service.checkout(order, paymant);
    }
}
