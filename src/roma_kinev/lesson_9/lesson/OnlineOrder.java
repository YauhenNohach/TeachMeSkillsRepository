package roma_kinev.lesson_9.lesson;

public class OnlineOrder extends Order{

    String deliveryAddress;

    public OnlineOrder(double totalPrice, Store store, Product[] products,CurrencyType currencyType, String deliveryAddress) {
        super(totalPrice, store, products, currencyType);
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}
