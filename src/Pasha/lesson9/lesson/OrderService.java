package Pasha.lesson9.lesson;

public class OrderService {

    protected void calculateTotal(Order order) throws EmptyOrderException, InvalidPriceException {
        Product[] products = order.getProducts();

        if (products == null || products.length == 0) {
            throw new EmptyOrderException("Shopping cart is empty!");
        }

        double sum = 0;
        for (Product product : products) {
            if (product.getPrice() <= 0) {
                throw new InvalidPriceException("Incorrect item price'" + product.getName() + "': " + product.getPrice());
            }
            sum += product.getPrice();
        }
        order.setTotalPrice(sum);
    }

    protected void processOrder(Order order) throws EmptyOrderException, InvalidPriceException, DeliveryException, CurrencyMismatchException {
        calculateTotal(order);

        if (order.getStore() != null) {
            order.getStore().applyDiscount(order);
        }

        if (order instanceof OnlineOrder onlineOrder) {
            if (onlineOrder.getDeliveryAddress() == null || onlineOrder.getDeliveryAddress() == null) {
                throw new DeliveryException("No address is set!");
            }
            order.setTotalPrice(order.getTotalPrice() + 5.0);
        }

        CurrencyType currencyType = order.getCurrencyType();
        if (currencyType != CurrencyType.EUR && currencyType != CurrencyType.USD && currencyType != CurrencyType.RUB) {
            throw new CurrencyMismatchException("Currency " + currencyType + " is not supported");
        }
    }
}
