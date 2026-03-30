package Pasha.lesson9.lesson;

public class PickupOrder extends Order {
    protected PickupOrder(Store store, Product[] products, CurrencyType currencyType) {
        super(store, products, currencyType);
    }
}
