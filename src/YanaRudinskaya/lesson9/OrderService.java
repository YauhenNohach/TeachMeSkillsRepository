package YanaRudinskaya.lesson9;

import YanaRudinskaya.lesson9.exception.CurrencyMismatchException;
import YanaRudinskaya.lesson9.exception.DeliveryException;
import YanaRudinskaya.lesson9.exception.EmptyOrderException;
import YanaRudinskaya.lesson9.exception.InvalidPriceException;

public class OrderService {
//🔹calculateTotal(Order order)
//    суммирует все products
//❗️ кидает EmptyOrderException, если товаров нет
//❗️ кидает InvalidPriceException, если цена некорректная
//
//🔹 processOrder(Order order)
//    вызывает calculateTotal
//    применяет скидку
//    если OnlineOrder:
//    проверить адрес → иначе DeliveryException
//    добавить доставку (+5€)
//    проверить валюту:
//    если не EUR/USD/RUB → CurrencyMismatchException

    public void calculateTotal(Order order) {

        Product[] products = order.getProducts();

        if (products == null || products.length == 0) {
            throw new EmptyOrderException("В заказе нет товаров");
        }

        double total = 0;

        for (Product product : products) {
            if (product.getPrice() <= 0) {
                throw new InvalidPriceException("Цена товара должна быть больше 0: " + product.getName());
            }
            total += product.getPrice();
        }

        order.setTotalPrice(total);
    }


    public void processOrder(Order order) {

        calculateTotal(order);
        order.getStore().applyDiscount(order);
        order.validate();
        order.applyDelivery();

        CurrencyType currency = order.getCurrencyType();

        if (currency != CurrencyType.EUR &&
                currency != CurrencyType.USD &&
                currency != CurrencyType.RUB) {

            throw new CurrencyMismatchException("Валюта не поддерживается: " + currency);
        }
    }
}





