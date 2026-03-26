package irina_lisovskaya.lesson9_exceptions.dz.service;

import irina_lisovskaya.lesson9_exceptions.dz.exception.CurrencyMismatchException;
import irina_lisovskaya.lesson9_exceptions.dz.exception.DeliveryException;
import irina_lisovskaya.lesson9_exceptions.dz.exception.EmptyOrderException;
import irina_lisovskaya.lesson9_exceptions.dz.exception.InvalidPriceException;
import irina_lisovskaya.lesson9_exceptions.dz.model.CurrencyType;
import irina_lisovskaya.lesson9_exceptions.dz.model.OnlineOrder;
import irina_lisovskaya.lesson9_exceptions.dz.model.Order;
import irina_lisovskaya.lesson9_exceptions.dz.model.Product;

import java.util.Arrays;

public class OrderService {

    public void calculateTotal(Order order) {
        if (order.getProducts() == null || order.getProducts().length == 0) {
            throw new EmptyOrderException("В заказе отсутствуют товары.");
        }

        double sum = 0;
        int countRealProducts = 0;
        StringBuilder productNames = new StringBuilder();

        for (Product product : order.getProducts()) {
            if (product != null) {
                countRealProducts++;

                if (productNames.length() > 0) {
                    productNames.append(", ");
                }
                productNames.append(product.getName());

                if (product.getPrice() <= 0) {
                    throw new InvalidPriceException("Товар '" + product.getName() + "' имеет некорректную стоимость: " + product.getPrice());
                }
                sum += product.getPrice();
            }
        }

        order.setTotalPrice(sum);

        System.out.println("--- Отчёт по заказу ---");
        System.out.println("Список товаров: " + productNames.toString());
        System.out.println("Количество товаров: " + countRealProducts);
        System.out.println("Стоимость заказа: " + sum + " " + order.getCurrencyType());
    }

    public void processOrder(Order order) {
        calculateTotal(order);
        CurrencyType currentCurrency = order.getCurrencyType();

        if (order.getCurrencyType() == null) {
            throw new CurrencyMismatchException("Валюта заказа не указана.");
        }
        if (currentCurrency != CurrencyType.EUR &&
                currentCurrency != CurrencyType.USD &&
                currentCurrency != CurrencyType.RUB) {

            throw new CurrencyMismatchException("Указанная валюта не поддерживается для оплаты.");
        }

        order.finalizeOrder();

        if (order.getStore() != null) {
            order.getStore().applyDiscount(order);
        }

        System.out.println("Заказ успешно оформлен. Итого к оплате с учётом скидки магазина: " + order.getTotalPrice() + " " + order.getCurrencyType());
    }


}
