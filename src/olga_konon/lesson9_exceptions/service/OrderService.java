package olga_konon.lesson9_exceptions.service;

import olga_konon.lesson9_exceptions.exceptions.CurrencyMismatchException;
import olga_konon.lesson9_exceptions.exceptions.DeliveryException;
import olga_konon.lesson9_exceptions.exceptions.EmptyOrderException;
import olga_konon.lesson9_exceptions.exceptions.InvalidPriceException;
import olga_konon.lesson9_exceptions.model.CurrencyType;
import olga_konon.lesson9_exceptions.model.OnlineOrder;
import olga_konon.lesson9_exceptions.model.Order;
import olga_konon.lesson9_exceptions.model.Product;

public class OrderService {
    double deliveryAmount = 5;

    public double calculateTotal(Order order) throws EmptyOrderException, InvalidPriceException {

        double totalPrice = 0;

        // кидает EmptyOrderException, если товаров нет
        Product[] products = order.getProducts();

        if (products.length == 0) {
            throw new EmptyOrderException("Empty order");
        }

        // кидает InvalidPriceException, если цена некорректная
        for (Product product : products) {
            double price = product.getPrice();
            if (product.getPrice() <= 0.0) {
                throw new InvalidPriceException("Not valid price");
            }
            totalPrice += price;

        }
        return totalPrice;
    }


    public void processOrder(Order order) throws InvalidPriceException, EmptyOrderException, DeliveryException, CurrencyMismatchException {

        double totalPrice = calculateTotal(order);

        //calculate discount
        double discountPercent = order.getStore().getDiscountPercent();
        double discountPrice = totalPrice * (discountPercent / 100);
        totalPrice -= discountPrice;

        // check if online order
        if (order instanceof OnlineOrder onlineOrder) {
            //check if delivery empty
            if (onlineOrder.getDeliveryAddress() == null || onlineOrder.getDeliveryAddress().isBlank()) {
                throw new DeliveryException("Missing delivery address");
            }
            totalPrice += deliveryAmount; // add 5 EUR

        }
        // check currency type
        CurrencyType currencyType = order.getCurrencyType();
        if (currencyType != CurrencyType.EUR
                && currencyType != CurrencyType.USD
                && currencyType != CurrencyType.RUB) {
            throw new CurrencyMismatchException("Currency is not supported: " + currencyType);
        }
        order.setTotalPrice(totalPrice);
    }
}


