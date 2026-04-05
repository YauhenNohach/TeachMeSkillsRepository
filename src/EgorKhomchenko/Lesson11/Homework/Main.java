package EgorKhomchenko.Lesson11.Homework;

import EgorKhomchenko.Lesson11.Homework.Model.*;
import EgorKhomchenko.Lesson11.Homework.Payment.BalancePayment;
import EgorKhomchenko.Lesson11.Homework.Payment.PaymentStrategy;
import EgorKhomchenko.Lesson11.Homework.Service.OrderService;

public class Main {
    public static void main(String[] args) {

        User user = new User(1L, "Ivan", 500.0);


        Product table = new PhysicalProduct("Table", 100.0, 1L, 12.5);
        Product chair = new PhysicalProduct("Chair", 40.0, 2L, 5.0);
        Product ebook = new DigitalProduct("Ebook", 10.0, 3L, 50.0);


        Order order = new Order(user);
        order.addProduct(table);
        order.addProduct(chair);
        order.addProduct(ebook);


        System.out.println("User: " + user.getName() + ", balance = " + user.getBalance());
        System.out.println("Order products:");
        order.getProducts().forEach(p ->
                System.out.println(" - " + p.getName() + " total = " + p.getTotalSum()));


        double total = order.getTotalPrice();
        System.out.println("Order total = " + total);


        OrderService service = new OrderService();
        PaymentStrategy payment = new BalancePayment();

        boolean paid = service.checkout(order, payment);

        if (paid) {
            System.out.println("Payment successful. New user balance = " + user.getBalance());
        } else {
            System.out.println("Payment failed. User balance = " + user.getBalance());
        }
    }
}