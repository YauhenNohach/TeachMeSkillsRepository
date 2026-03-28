package anna_sidorova.lesson9.lessons;

public class PickUpOrder extends Order {


    public PickUpOrder(double totalPrice, Store store, Product[] products, CurrencyType currencyType) {
        super(totalPrice, store, products, currencyType);
    }
}
