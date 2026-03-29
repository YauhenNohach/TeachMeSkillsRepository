package yanina_savich.lesson9_exceptions.lesson;

public class PickupOrder extends Order{
    public PickupOrder(Product[] products, Store store, CurrencyType currencyType) {
        super(products, store, currencyType);
    }
}
