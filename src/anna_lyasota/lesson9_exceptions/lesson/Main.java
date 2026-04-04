package anna_lyasota.lesson9_exceptions.lesson;

import anna_lyasota.lesson9_exceptions.lesson.exception.CurrencyMismatchException;
import anna_lyasota.lesson9_exceptions.lesson.exception.DeliveryException;
import anna_lyasota.lesson9_exceptions.lesson.exception.EmptyOrderException;
import anna_lyasota.lesson9_exceptions.lesson.exception.InvalidPriceException;

public class Main {
    public static void main(String[] args) {

        // 1. Создаем несколько продуктов
        Product product1 = new Product();
        product1.setName("Hat");
        product1.setPrice(10.0);

        Product product2 = new Product();
        product2.setName("Shoes");
        product2.setPrice(30.0);

        Product product3 = new Product("Apple", 2.0);
        Product product4 = new Product("Bread", 1.0);

        Product[] products = new Product[4];
        products[0] = product1;
        products[1] = product2;
        products[2] = product3;
        products[3] = product4;

        OnlineOrder onlineOrder = new OnlineOrder();
        onlineOrder.setProducts(products);
        onlineOrder.setDeliveryAddress("Levina, Minsk");
        onlineOrder.setCurrencyType(CurrencyType.USD);
        onlineOrder.setTotalPrice(0);

        OrderService orderService = new OrderService();

        try {
            double finalTotal = orderService.processOrder(onlineOrder);
            System.out.println("Итоговая сумма заказа: " + finalTotal);
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