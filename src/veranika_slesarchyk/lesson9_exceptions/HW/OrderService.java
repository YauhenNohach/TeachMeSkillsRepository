package veranika_slesarchyk.lesson9_exceptions.HW;

import veranika_slesarchyk.lesson9_exceptions.HW.exceptions.CurrencyMismatchException;
import veranika_slesarchyk.lesson9_exceptions.HW.exceptions.DeliveryException;
import veranika_slesarchyk.lesson9_exceptions.HW.exceptions.EmptyOrderException;
import veranika_slesarchyk.lesson9_exceptions.HW.exceptions.InvalidPriceException;

public class OrderService {

    //🔹calculateTotal(Order order)
    //суммирует все products
    //❗️ кидает EmptyOrderException, если товаров нет
    //❗️ кидает InvalidPriceException, если цена некорректная

    public double calculateTotal(Order order)
            throws EmptyOrderException, InvalidPriceException {

        Product[] products = order.getProducts();

        if (products == null || products.length == 0) {
            throw new EmptyOrderException("Нет товаров в заказе");
        }

        double sum = 0;

        for (Product p : products) {
            if (p.getPrice() <= 0) {
                throw new InvalidPriceException("Некорректная цена: " + p.getName());
            }
            sum += p.getPrice();
        }
        order.setTotalPrice(sum);
        return sum;
    }

    //🔹 processOrder(Order order)
    //вызывает calculateTotal
    //применяет скидку
    //если OnlineOrder:
    //проверить адрес → иначе DeliveryException
    //добавить доставку (+5€)

    public void processOrder(Order order)
            throws EmptyOrderException, InvalidPriceException,
            DeliveryException, CurrencyMismatchException {

        calculateTotal(order);

        // скидка
        order.getStore().applyDiscount(order);

        // проверка валюты
        if (order.getCurrencyType() == null) {
            throw new CurrencyMismatchException("Валюта не указана");
        }

        // OnlineOrder логика
        if (order instanceof OnlineOrder) {
            OnlineOrder onlineOrder = (OnlineOrder) order;

            if (onlineOrder.getDeliveryAddress() == null ||
                    onlineOrder.getDeliveryAddress().isEmpty()) {
                throw new DeliveryException("Адрес доставки не указан");
            }

            // доставка +5€
            order.setTotalPrice(order.getTotalPrice() + 5);
        }
    }
}

