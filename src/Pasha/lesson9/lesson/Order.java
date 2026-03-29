package Pasha.lesson9.lesson;

public abstract class Order {
    private double totalPrice;
    private Store store;
    private Product[] products;
    private CurrencyType currencyType;

    private static int countOrder = 0;

    protected Order(Store store, Product[] products, CurrencyType currencyType) {
        this.store = store;
        this.products = products;
        this.currencyType = currencyType;
    }

    protected double getTotalPrice() {
        return totalPrice;
    }

    protected void setTotalPrice(double totalPrice) {
        this.totalPrice = Math.round(totalPrice * 100) / 100.0;
    }

    protected Store getStore() {
        return store;
    }

    protected void setStore(Store store) {
        this.store = store;
    }

    protected Product[] getProducts() {
        return products;
    }

    protected void setProducts(Product[] products) {
        this.products = products;
    }

    protected CurrencyType getCurrencyType() {
        return currencyType;
    }

    protected void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    protected int getCountOrder(Product[] products) {
        countProducts(products);
        return countOrder;
    }

    protected void countProducts(Product[] products) {
        for (Product product: products) {
            countOrder++;
        }
    }
}
