package EgorKhomchenko.Lesson9.Homework;

import EgorKhomchenko.Lesson9.Homework.Enums.CurrencyType;

public class PickupOrder extends Order {
    public PickupOrder(double totalPrice, Store store, Product[] products, CurrencyType currencyType) {
        super(totalPrice, store, products, currencyType);
    }
}
