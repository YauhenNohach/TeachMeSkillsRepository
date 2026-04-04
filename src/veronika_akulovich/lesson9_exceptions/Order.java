package veronika_akulovich.lesson9_exceptions;

public abstract class Order {
    private double totalPrice;
    private Store store;
   private Product[] products;
   private CurrencyType currencyType;
    private static int countOrder;

    public Order() {
    }

    public Order(double totalPrice, Store store, Product[] products, CurrencyType currencyType) {
        this.totalPrice = totalPrice;
        this.store = store;
        this.products = products;
        this.currencyType = currencyType;
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
