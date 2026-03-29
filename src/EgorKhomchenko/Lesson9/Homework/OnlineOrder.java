package EgorKhomchenko.Lesson9.Homework;

import EgorKhomchenko.Lesson9.Homework.Enums.CurrencyType;

public class OnlineOrder extends Order {
    private final String deliveryAddress;

    public OnlineOrder(double totalPrice, Store store, Product[] products, CurrencyType currencyType, String deliveryAddress) {
        super(totalPrice, store, products, currencyType);
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress; }
}
