package Pasha.lesson9.lesson;

public class OnlineOrder extends Order {
    private final String deliveryAddress;

    protected OnlineOrder(Store store, Product[] products, CurrencyType currencyType, String deliveryAddress) {
        super(store, products, currencyType);
        this.deliveryAddress = deliveryAddress;
    }

    protected String getDeliveryAddress() {
        return deliveryAddress;
    }
}
