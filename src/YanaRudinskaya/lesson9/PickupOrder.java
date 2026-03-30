package YanaRudinskaya.lesson9;

public class PickupOrder extends Order{

    public PickupOrder(double totalPrice, Store store, Product[] products, CurrencyType currencyType) {
        super(totalPrice, store, products, currencyType);
    }
    @Override
    public void validate() {
    }
    @Override
    public void applyDelivery() {
    }

}
