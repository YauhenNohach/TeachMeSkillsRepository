package viktoriya_satsiuk.lesson_9_exceptions.Homework.Model;

import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.CurrencyMismatchException;

public abstract class Order {
    private double totalPrice;
    private Store store;
    private Product[] products;
    private CurrencyType currencyType;
    private static int countOrder;

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

    public static int getCountOrder() {
        return countOrder;
    }

    public void setCurrencyType(CurrencyType currencyType) throws CurrencyMismatchException {
        if (currencyType == null) {
            throw new CurrencyMismatchException("Please enter valid currency type.");
        }
        this.currencyType = currencyType;
    }

    public Order(Store store, Product[] products, CurrencyType currencyType) throws CurrencyMismatchException {

        this.store = store;
        this.products = products;
        setCurrencyType(currencyType);
        countOrder++;
    }

}
