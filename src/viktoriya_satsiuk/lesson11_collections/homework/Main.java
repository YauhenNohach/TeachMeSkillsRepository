package viktoriya_satsiuk.lesson11_collections.homework;

import viktoriya_satsiuk.lesson11_collections.homework.exception.InsufficientFundsException;
import viktoriya_satsiuk.lesson11_collections.homework.model.*;
import viktoriya_satsiuk.lesson11_collections.homework.payment.PaymentStrategy;
import viktoriya_satsiuk.lesson11_collections.homework.service.*;

public class Main {
    public static void main(String[] args) {
        User max = new User(2, 700, "Max");
        User charlie = new User(3, 5000, "Charlie");

        PhysicalProduct phone = new PhysicalProduct(1, "Phone", 400, 2);
        PhysicalProduct laptop = new PhysicalProduct(2, "Laptop", 900, 4);
        PhysicalProduct tv = new PhysicalProduct(3, "TV", 2000, 4);

        DigitalProduct ebook = new DigitalProduct(4, "Subscription", 50, 20);
        DigitalProduct guide = new DigitalProduct(5, "Guide", 50, 14);

        Order charlieOrder = new Order(charlie);
        charlieOrder.addProduct(tv);
        charlieOrder.addProduct(phone);
        charlieOrder.addProduct(guide);

        Order maxOrder = new Order(max);
        maxOrder.addProduct(phone);
        maxOrder.addProduct(laptop);
        maxOrder.addProduct(ebook);

        PaymentStrategy payment = new BalancePayment();
        OrderService service = new OrderService();

        try {
            //Проводим успешную покупку
            service.checkout(charlieOrder, payment);
            System.out.println("Order completed! " + charlie.getName() + "'s balance: " + charlie.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            //Проводим неуспешную покупку
            service.checkout(maxOrder, payment);
            System.out.println("Order completed! " + max.getName() + "'s balance: " + max.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
