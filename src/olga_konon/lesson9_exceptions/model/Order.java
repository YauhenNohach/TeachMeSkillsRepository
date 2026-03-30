package olga_konon.lesson9_exceptions.model;

public abstract class Order {

    private double totalPrice;
    private Store store;
    private Product[] products;
    private static int countOrder = 0;
    private CurrencyType currencyType;

    public Order() {
        // this.totalPrice = totalPrice;
        //  this.store = store;
        //this.products = products;
        countOrder++;
    }


    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }
}