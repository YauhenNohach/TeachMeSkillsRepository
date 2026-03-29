package Lera_Grubrina.Lesson9;

public class OnlineOrder extends Order {
    private String deliveryAddress;

    public OnlineOrder(Store store, Product[] products, CurrencyType currencyType, String deliveryAddress) {
        super(store, products, currencyType);
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}

