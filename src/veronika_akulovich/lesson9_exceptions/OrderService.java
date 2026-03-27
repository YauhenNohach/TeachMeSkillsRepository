package veronika_akulovich.lesson9_exceptions;

import veronika_akulovich.lesson9_exceptions.exception.CurrencyMismatchException;
import veronika_akulovich.lesson9_exceptions.exception.DeliveryException;
import veronika_akulovich.lesson9_exceptions.exception.EmptyOrderException;
import veronika_akulovich.lesson9_exceptions.exception.InvalidPriceException;

import java.util.EnumSet;

public class OrderService {
    public double calculateTotal(Order order) {

        if (order.getProducts() == null || order.getProducts().length == 0) {
            throw new EmptyOrderException("Products not found");
        }
        double tempGetPrice = 0;
        for (int i = 0; i < order.getProducts().length; i++) {
            if (order.getProducts()[i].getPrice() <= 0) {
                throw new InvalidPriceException("Price incorrect");
            }
            tempGetPrice = order.getProducts()[i].getPrice();
        }
        order.setTotalPrice(tempGetPrice);
        return tempGetPrice;
    }

    public void processOrder(Order order) {
        calculateTotal(order);

        Store store = order.getStore();
        store.applyDiscount(order);

        if (order instanceof OnlineOrder onlineOrder && (onlineOrder.getDeliveryAddress() == null || onlineOrder.getDeliveryAddress().isBlank())){
            throw new DeliveryException("Incorrect delivery address");
        }
        double deliveryFee = 5;
        order.setTotalPrice(order.getTotalPrice() + deliveryFee);

        if (!EnumSet.allOf(CurrencyType.class).contains(order.getCurrencyType())) {
            throw new CurrencyMismatchException("Incorrect currency type");
        }
    }
}
//order.getCurrencyType() != CurrencyType.EUR && order.getCurrencyType() != CurrencyType.RUB && order.getCurrencyType() != CurrencyType.USD)