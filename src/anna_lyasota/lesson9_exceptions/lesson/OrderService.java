package anna_lyasota.lesson9_exceptions.lesson;

import anna_lyasota.lesson9_exceptions.lesson.exception.CurrencyMismatchException;
import anna_lyasota.lesson9_exceptions.lesson.exception.DeliveryException;
import anna_lyasota.lesson9_exceptions.lesson.exception.EmptyOrderException;
import anna_lyasota.lesson9_exceptions.lesson.exception.InvalidPriceException;

public class OrderService {

    //calculateTotal(Order order) суммирует все products
    //кидает EmptyOrderException, если товаров нет
    // кидает InvalidPriceException, если цена некорректная
    public double calculateTotal(Order order) {

        if (order == null || order.getProducts() == null || order.getProducts().length == 0) {
            throw new EmptyOrderException("Товаров нет");
        }

        double total = 0;
        Product[] products = order.getProducts();

        boolean hasProduct = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                hasProduct = true;

                double price = products[i].getPrice();

                if (price <= 0) {
                    throw new InvalidPriceException("Цена некорректная");
                }

                total += price;
            }
        }

        if (!hasProduct) {
            throw new EmptyOrderException("Товаров нет");
        }

        return total;

    }

    //processOrder(Order order)
    //вызывает calculateTotal
    //применяет скидку
    //если OnlineOrder:
    //проверить адрес → иначе DeliveryException
    //добавить доставку (+5€)
    //проверить валюту:
    //если не EUR/USD/RUB → CurrencyMismatchException
    public double processOrder(Order order) {

        double total = calculateTotal(order);
        total = total * 0.8;

        OnlineOrder onlineOrder = null;
        if (order instanceof OnlineOrder) {
            onlineOrder = (OnlineOrder) order;
        }

        if (onlineOrder.getDeliveryAddress() == null || onlineOrder.getDeliveryAddress().isEmpty()) {
            throw new DeliveryException("Не указан адрес:");
        }

        total += 5;

        CurrencyType currency = order.getCurrencyType();

        if (currency != CurrencyType.EUR && currency != CurrencyType.USD && currency != CurrencyType.RUB) {

            throw new CurrencyMismatchException("Неподдерживаемый формат валюты: " + currency);
        }

        return total;
    }

}
