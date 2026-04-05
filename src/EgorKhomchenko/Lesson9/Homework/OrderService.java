package EgorKhomchenko.Lesson9.Homework;

import EgorKhomchenko.Lesson9.Homework.Enums.CurrencyType;
import EgorKhomchenko.Lesson9.Homework.Exceptions.CurrencyMismatchException;
import EgorKhomchenko.Lesson9.Homework.Exceptions.DeliveryException;
import EgorKhomchenko.Lesson9.Homework.Exceptions.EmptyOrderException;
import EgorKhomchenko.Lesson9.Homework.Exceptions.InvalidPriceException;

public class OrderService {
    private static final double DELIVERY_FEE = 5.0;

    // Суммирует все products в заказе.
    public double calculateTotal(Order order) {
        Product[] products = order.getProducts();
        if (products == null || products.length == 0) {
            throw new EmptyOrderException("Order has no products");
        }

        double total = 0.0;
        for (Product p : products) {
            if (p == null) continue;
            if (p.getPrice() <= 0.0) {
                throw new InvalidPriceException("Invalid price for product '" + p.getName() + "': " + p.getPrice());
            }
            total += p.getPrice();
        }
        return total;
    }


    public double processOrder(Order order) {
        if (order == null) {
            throw new NullPointerException("order must not be null");
        }

        // Проверка валюты
        CurrencyType currency = order.getCurrencyType();
        if (currency == null) {
            throw new CurrencyMismatchException("Order currency is null or unsupported");
        }
        boolean supported = currency == CurrencyType.EUR || currency == CurrencyType.USD || currency == CurrencyType.RUB;
        if (!supported) {
            throw new CurrencyMismatchException("Unsupported currency: " + currency);
        }

        // Базовая сумма
        double total = calculateTotal(order);
        order.setTotalPrice(total);


        Store store = order.getStore();
        if (store != null) {
            store.applyDiscount(order);
            total = order.getTotalPrice();
        }


        if (order instanceof OnlineOrder online) {
            String address = online.getDeliveryAddress();
            if (address == null || address.trim().isEmpty()) {
                throw new DeliveryException("Online order missing delivery address");
            }
            total += DELIVERY_FEE;
            order.setTotalPrice(total);
        }

        return total;
    }
}