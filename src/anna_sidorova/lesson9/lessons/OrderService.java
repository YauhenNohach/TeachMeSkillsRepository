package anna_sidorova.lesson9.lessons;

import anna_sidorova.lesson9.lessons.exceptions.CurrencyMismatchexception;
import anna_sidorova.lesson9.lessons.exceptions.DeliveryException;
import anna_sidorova.lesson9.lessons.exceptions.EmptyOrderException;
import anna_sidorova.lesson9.lessons.exceptions.InvalidPriceException;

public class OrderService {

    public double calculateTotal(Order order) throws EmptyOrderException, InvalidPriceException {
        if (order.getProducts() == null) {
            throw new EmptyOrderException("В заказе нет товаров!");
        }
        double sum = 0;
        for (Product p : order.getProducts()) {
            if (p.getPrice() <= 0) {
                throw new InvalidPriceException(
                        "Неверная цена у продукта! " + p.getPrice()
                );
            }
            sum += p.getPrice();
        }
        return sum;
    }

    public void processOrder(Order order) throws DeliveryException, CurrencyMismatchexception {
        if (!(order.getCurrencyType() == CurrencyType.RUB || order.getCurrencyType() == CurrencyType.EUR || order.getCurrencyType() == CurrencyType.USD)) {
            throw new CurrencyMismatchexception("Валюта не указана");
        }
        // применяем метод calculateTotal
        double total = calculateTotal(order);
        // применяем скидку
        order.getStore().applyDiscount(order);
        // проверяем для OnlineOrder
        if (order instanceof OnlineOrder) {
            OnlineOrder onlineOrder = (OnlineOrder) order;

            if (onlineOrder.getDeliveryAddress() == null
                    || onlineOrder.getDeliveryAddress().isEmpty()) {
                throw new DeliveryException("Адрес доставки не указан!");
            }
        }
    }
}

