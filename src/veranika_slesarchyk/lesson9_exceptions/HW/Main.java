package veranika_slesarchyk.lesson9_exceptions.HW;

import veranika_slesarchyk.lesson9_exceptions.HW.exceptions.CurrencyMismatchException;
import veranika_slesarchyk.lesson9_exceptions.HW.exceptions.DeliveryException;
import veranika_slesarchyk.lesson9_exceptions.HW.exceptions.EmptyOrderException;
import veranika_slesarchyk.lesson9_exceptions.HW.exceptions.InvalidPriceException;

public class Main {
    public static void main(String[] args) {
//создать несколько продуктов
//создать заказ
//обернуть вызов в try-catch
//try {
//    orderService.processOrder(order);
//} catch (EmptyOrderException e) {
//    System.out.println("Заказ пуст: " + e.getMessage());
//} catch (InvalidPriceException e) {
//    System.out.println("Ошибка цены: " + e.getMessage());
//} catch (DeliveryException e) {
//    System.out.println("Ошибка доставки: " + e.getMessage());
//} catch (CurrencyMismatchException e) {
//    System.out.println("Ошибка валюты: " + e.getMessage());}
        ;
        Product product1 = new Product("Телефон", 500);
        Product product2 = new Product("Наушники", 300);
        Product[] products = {product1, product2};
        Store store = new Store("TechStore", 15);
        Order order = new OnlineOrder(100, store, products, CurrencyType.EUR, "Warsaw, Poland");
        OrderService orderService = new OrderService();

        try {
            orderService.processOrder(order);
            System.out.println("Итоговая сумма: " + order.getTotalPrice());
            System.out.println("Всего заказов: " + Order.getCountOrder());

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
