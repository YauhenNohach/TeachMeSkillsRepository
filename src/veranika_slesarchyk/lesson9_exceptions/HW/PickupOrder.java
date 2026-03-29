package veranika_slesarchyk.lesson9_exceptions.HW;

public class PickupOrder extends Order {
    public PickupOrder(double totalPrice, Store store, Product[] products, CurrencyType currencyType) {
        super(totalPrice, store, products, currencyType);
    }
}
