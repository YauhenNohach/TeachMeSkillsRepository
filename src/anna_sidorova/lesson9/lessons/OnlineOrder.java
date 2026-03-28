package anna_sidorova.lesson9.lessons;

import java.util.Collection;

public class OnlineOrder extends Order {

    Collection<Object> deliveryAddress;

    public OnlineOrder(double totalPrice, Store store, Product[] products, CurrencyType currencyType) {
        super(totalPrice, store, products, currencyType);
    }

    public Collection<Object> getDeliveryAddress() {
        return deliveryAddress;
    }

}
