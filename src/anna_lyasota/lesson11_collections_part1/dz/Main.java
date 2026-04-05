package anna_lyasota.lesson11_collections_part1.dz;

import anna_lyasota.lesson11_collections_part1.dz.model.BalancePayment;
import anna_lyasota.lesson11_collections_part1.dz.model.DigitalProduct;
import anna_lyasota.lesson11_collections_part1.dz.model.Order;
import anna_lyasota.lesson11_collections_part1.dz.model.PhysicalProduct;
import anna_lyasota.lesson11_collections_part1.dz.payment.PaymentStrategy;
import anna_lyasota.lesson11_collections_part1.dz.service.OrderService;
import anna_lyasota.lesson11_collections_part1.dz.service.User;

public class Main {
    public static void main(String[] args) {
        // создать метод Main, с объектами User, несколько продуктов и заказ .
        // Добавить продукты в заказ. И проверить оплату

        User user = new User(1, 300.0, "Anna");

        PhysicalProduct course = new PhysicalProduct(1, "Course", 100.0, 0);
        DigitalProduct onlineCourse = new DigitalProduct(2, "OnlineCourse", 80.0, 10.0);

        Order order = new Order(user);

        order.addProduct(course);
        order.addProduct(onlineCourse);
        System.out.println("Общая стоимость заказа: " + order.getTotalPrice());

        OrderService service = new OrderService();
        PaymentStrategy payment = new BalancePayment();
        service.checkout(order, payment);
    }
}
