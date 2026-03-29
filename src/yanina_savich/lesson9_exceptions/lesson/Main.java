package yanina_savich.lesson9_exceptions.lesson;

import yanina_savich.lesson9_exceptions.lesson.Service.OrderService;
import yanina_savich.lesson9_exceptions.lesson.exception.CurrencyMismatchException;
import yanina_savich.lesson9_exceptions.lesson.exception.DeliveryException;
import yanina_savich.lesson9_exceptions.lesson.exception.EmptyOrderException;
import yanina_savich.lesson9_exceptions.lesson.exception.InvalidPriceException;

public class Main {
    public static void main(String[] args){
        Store store = new Store("21 век", 10);

        Product[] products = {
                new Product("Phone", 1500),
                new Product("Laptop", 4500)
        };

        Order order = new OnlineOrder (products, store, CurrencyType.EUR, "Minsk");
        OrderService service = new OrderService();
        try {
            service.processOrder(order);
            System.out.println("Заказ обработан");
            System.out.println("Итого сумма: " + order.getTotalPrice());
        } catch (EmptyOrderException e){
            System.out.println("Пустой заказ -> " + e.getMessage());
        } catch (InvalidPriceException e) {
            System.out.println("Ошибка в цене -> " + e.getMessage());
        } catch (DeliveryException e){
            System.out.println("Ошибка в адрессе доставки -> " + e.getMessage());
        } catch (CurrencyMismatchException e){
            System.out.println("Ошибка валюты -> " + e.getMessage());
        }
        System.out.println("Всего заказов: " + Order.getCountOrder());
    }
}
