package roma_kinev.lesson_9.lesson;

public class PickupOrder extends Order{

    public PickupOrder(double totalPrice, Store store, Product[] products, CurrencyType currencyType) {
        super(totalPrice, store, products, currencyType);
    }
}
