package irina_lisovskaya.lesson9_exceptions.dz.model;

public abstract class Order {
    // fields
    private double totalPrice;
    private Store store;
    private Product[] products;
    private CurrencyType currencyType;
    private static int countOrder = 0;


    // methods
    public Order() {
        countOrder++;
    }

    public static int getCountOrder() {
        return countOrder;
    }

    public static void setCountOrder(int countOrder) {
        Order.countOrder = countOrder;
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

    public void finalizeOrder() {

    }

}
