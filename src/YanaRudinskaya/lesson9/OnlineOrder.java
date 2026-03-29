package YanaRudinskaya.lesson9;

import YanaRudinskaya.lesson9.exception.DeliveryException;

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

    public void validate() {
        if (deliveryAddress == null ) {
            throw new DeliveryException("Адрес доставки не указан");
        }
    }

    public void applyDelivery() {
        setTotalPrice(getTotalPrice() + 5);
    }


}
