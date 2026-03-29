package Lera_Grubrina.Lesson9;

public class OrderService {

    public double calculateTotal(Order order) throws EmptyOrderException, InvalidPriceException {
        Product[] products = order.getProducts();

        if (products == null || products.length == 0) {
            throw new EmptyOrderException("В заказе нет товаров :с");
        }

        double total = 0;

        for (Product product : products) {
            if (product.getPrice() <= 0) {
                throw new InvalidPriceException("Некорректная цена у товара: " + product.getName() + " (" + product.getPrice() + ")");
            }
            total += product.getPrice();
        }

        order.setTotalPrice(total);
        return total;
    }

    public void processOrder(Order order) throws EmptyOrderException, InvalidPriceException, DeliveryException, CurrencyMismatchException {
        calculateTotal(order);

        Store store = order.getStore();
        if (store != null) {
            store.applyDiscount(order);
        }

        CurrencyType currency = order.getCurrencyType();
        if (currency == null || (currency != CurrencyType.EUR && currency != CurrencyType.USD && currency != CurrencyType.RUB)) {
            throw new CurrencyMismatchException("Валюта не поддерживается или не указана :с");
        }


        if (order instanceof OnlineOrder) {
            OnlineOrder onlineOrder = (OnlineOrder) order;

            String address = onlineOrder.getDeliveryAddress();
            if (address == null || address.trim().isEmpty()) {
                throw new DeliveryException("У онлайн-заказа не указан адрес доставки :с");
            }

            double currentPrice = onlineOrder.getTotalPrice();
            onlineOrder.setTotalPrice(currentPrice + 5);
        }
    }
}
