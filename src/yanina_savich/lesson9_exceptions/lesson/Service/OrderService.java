package yanina_savich.lesson9_exceptions.lesson.Service;

import yanina_savich.lesson9_exceptions.lesson.Order;
import yanina_savich.lesson9_exceptions.lesson.Product;
import yanina_savich.lesson9_exceptions.lesson.exception.CurrencyMismatchException;
import yanina_savich.lesson9_exceptions.lesson.exception.EmptyOrderException;
import yanina_savich.lesson9_exceptions.lesson.exception.InvalidPriceException;

public class OrderService {
    void calculateTotal(Order order) {
        Product[] products = order.getProducts();
        if (products == null || products.length == 0) {
            throw new EmptyOrderException("Нет товаров в заказе!");
        }
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product.getPrice() <= 0) {
                throw new InvalidPriceException("Некорректная цена товара!");
            }
            total += product.getPrice();

        }
        order.setTotalPrice(total);
    }

    public void processOrder(Order order) {
        calculateTotal(order);
        if (order.getCurrencyType() == null) {
            throw new CurrencyMismatchException("Валюта не указана");
        }
        order.getStore().applyDiscount(order);
        order.processOrder();
    }
}
