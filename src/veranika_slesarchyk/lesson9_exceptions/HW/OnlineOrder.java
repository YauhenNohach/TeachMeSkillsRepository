package veranika_slesarchyk.lesson9_exceptions.HW;

public class OnlineOrder extends Order{
    private String deliveryAddress;

    public OnlineOrder(double totalPrice, Store store, Product[] products, CurrencyType currencyType, String deliveryAddress) {
        super(totalPrice, store, products, currencyType);
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
