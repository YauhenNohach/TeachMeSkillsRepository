package viktoriya_satsiuk.lesson_9_exceptions.Homework.Service;

import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.CurrencyMismatchException;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.DeliveryException;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.EmptyOrderException;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.InvalidPriceException;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Model.OnlineOrder;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Model.Order;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Model.Product;

public class OrderService {

    public static void calculateTotal(Order order) throws EmptyOrderException, InvalidPriceException {
        if (order == null || order.getProducts() == null || order.getProducts().length == 0) {
            throw new EmptyOrderException("Order must not be empty");
        }
        double sum = 0;
        for (Product product : order.getProducts()) {
            if (product.getPrice() <= 0) {
                throw new InvalidPriceException("Price has invalid price");
            }
            sum += product.getPrice();
        }
        order.setTotalPrice(sum);
    }

    public static void processOrder(Order order) throws DeliveryException, CurrencyMismatchException, InvalidPriceException, EmptyOrderException {
        calculateTotal(order);
        if (order.getStore() != null) {
            order.getStore().applyDiscount(order);
        }
        if (order instanceof OnlineOrder online) {
            if (online.getDeliveryAddress() == null || online.getDeliveryAddress().isEmpty()) {
                throw new DeliveryException("Delivery address should not be empty");
            }
            double finalPrice = online.getTotalPrice() + 5.0;
            online.setTotalPrice(finalPrice);
        }
        if (order.getCurrencyType() == null) {
            throw new CurrencyMismatchException("Currency not supported");
        }
    }
}
