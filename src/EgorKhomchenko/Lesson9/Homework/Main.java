package EgorKhomchenko.Lesson9.Homework;

import EgorKhomchenko.Lesson9.Homework.Enums.CurrencyType;
import EgorKhomchenko.Lesson9.Homework.Exceptions.CurrencyMismatchException;
import EgorKhomchenko.Lesson9.Homework.Exceptions.DeliveryException;
import EgorKhomchenko.Lesson9.Homework.Exceptions.EmptyOrderException;
import EgorKhomchenko.Lesson9.Homework.Exceptions.InvalidPriceException;

public class Main {
    public static void main(String[] args) {

        Store store = new Store("BookStore", 10.0); // 10% скидка

        Product p1 = new Product("Book", 15.99);
        Product p2 = new Product("Pen", 1.99);
        Product[] products = new Product[]{ p1, p2 };


        Order order = new OnlineOrder(0.0, store, products, CurrencyType.EUR, "ул. Пушкина, дом 1");

        OrderService orderService = new OrderService();

        try {
            double finalTotal = orderService.processOrder(order);
            System.out.printf("Итог: %.2f %s%n", finalTotal, order.getCurrencyType());
        } catch (EmptyOrderException e) {
            System.out.println("Заказ пуст: " + e.getMessage());
        } catch (InvalidPriceException e) {
            System.out.println("Ошибка цены: " + e.getMessage());
        } catch (DeliveryException e) {
            System.out.println("Ошибка доставки: " + e.getMessage());
        } catch (CurrencyMismatchException e) {
            System.out.println("Ошибка валюты: " + e.getMessage());
        }
    }
}
