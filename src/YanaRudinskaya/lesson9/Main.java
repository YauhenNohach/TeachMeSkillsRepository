package YanaRudinskaya.lesson9;

import YanaRudinskaya.lesson9.exception.CurrencyMismatchException;
import YanaRudinskaya.lesson9.exception.DeliveryException;
import YanaRudinskaya.lesson9.exception.EmptyOrderException;
import YanaRudinskaya.lesson9.exception.InvalidPriceException;

public class Main {
    public static void main(String[] args) {

        Store store = new Store("Гиппо", 10);

        Product[] products = {
                new Product("Манго", 2),
                new Product("Пицца", 3)
        };

        Product[] products2 = {};

        Product[] products3 = {
                new Product("Манго", 0),
                new Product("Пицца", 2)
        };

        Order order1 = new OnlineOrder(5, store, products, CurrencyType.EUR, "Минск, Независимости,10");
        Order order2 = new OnlineOrder(0, store, products2, CurrencyType.EUR, "Минск, Независимости,10");
        Order order3 = new OnlineOrder(2, store, products3, CurrencyType.EUR, "Минск, Независимости,10");
        Order order4 = new OnlineOrder(5, store, products, CurrencyType.EUR,null);
        Order order5 = new OnlineOrder(5, store, products, null,"Минск, Независимости,10");


        OrderService orderService = new OrderService();

        try {
            orderService.processOrder(order5);
            System.out.println("Итоговая цена: " + order5.getTotalPrice());   //order1
        } catch (EmptyOrderException e) {
            System.out.println("Заказ пуст: " + e.getMessage());           //order2
        } catch (InvalidPriceException e) {
            System.out.println("Ошибка цены: " + e.getMessage());      //order3
        } catch (DeliveryException e) {
            System.out.println("Ошибка доставки: " + e.getMessage());     //order4
        } catch (CurrencyMismatchException e) {
            System.out.println("Ошибка валюты: " + e.getMessage());    //order5
        }
    }
}
