package roma_kinev.lesson_9.lesson;

public class OrderService {

    public void calculateTotal(Order order) throws EmptyOrderException, InvalidPriceException{
        Product[] products = order.getProducts();

        if (products != null || products.length == 0) {
            throw new EmptyOrderException("В заказе нет товаров");
        }

        double sum = 0;

        for (Product p : products){
            if (p.getPrice() <= 0){
                throw new InvalidPriceException("Некоректная цена у товара: " + p.getName());
            }
            sum += p.getPrice();
        }
        order.setTotalPrice(sum);
    }

    public void processOrder(Order order) throws EmptyOrderException, InvalidPriceException, DeliveryException, CurrencyMismatchException{
        calculateTotal(order);
        order.getStore().applyDiscount(order);
        if (order instanceof OnlineOrder onlineOrder) {
            if (onlineOrder.getDeliveryAddress() == null || onlineOrder.deliveryAddress.isEmpty() ) {
                throw new DeliveryException("Адрес доставки не указан");
            }
            order.setTotalPrice(order.getTotalPrice() + 5);
        }
        if (order.getCurrencyType() != CurrencyType.EUR && order.getCurrencyType() != CurrencyType.RUB && order.getCurrencyType() != CurrencyType.USD){
            throw new CurrencyMismatchException("Валюта не поддерживается");
        }
        System.out.println("Заказ успешно обработан. Итоговая цена: " + order.getTotalPrice());
    }
}
