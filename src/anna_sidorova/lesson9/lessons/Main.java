package anna_sidorova.lesson9.lessons;

import anna_sidorova.lesson9.lessons.exceptions.CurrencyMismatchexception;
import anna_sidorova.lesson9.lessons.exceptions.DeliveryException;
import anna_sidorova.lesson9.lessons.exceptions.EmptyOrderException;
import anna_sidorova.lesson9.lessons.exceptions.InvalidPriceException;

import static anna_sidorova.lesson9.lessons.CurrencyType.*;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("наушники", 455);
        Product product1 = new Product("телевизор", 13456);
        Product product2 = new Product("рюкзак", 5400);
        Product product3 = new Product("компьютерное кресло", 15200);
        Product[] products = {product, product1, product2, product3};
        Store store = new Store("DNS");
        Order order1 = new PickUpOrder(2333, store, products, USD);
        Order order2 = new OnlineOrder(12344, store, products, EUR);
        Order order = new Order(3440, store, products, RUB) {
            @Override
            public Product[] getProducts() {
                return super.getProducts();
            }
        };

        Order order3 = new OnlineOrder(3434, store, products, CurrencyType.RUB);
        OrderService orderService = new OrderService();
        try {
            orderService.processOrder(order1);

        } catch (EmptyOrderException e) {

            System.out.println("Заказ пуст: " + e.getMessage());

        } catch (InvalidPriceException e) {

            System.out.println("Ошибка цены: " + e.getMessage());

        } catch (DeliveryException e) {

            System.out.println("Ошибка доставки: " + e.getMessage());

        } catch (CurrencyMismatchexception e) {

            System.out.println("Ошибка валюты: " + e.getMessage());
        }
    }

}
