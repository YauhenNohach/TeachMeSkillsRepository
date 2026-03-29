package veranika_slesarchyk.lesson9_exceptions.HW;

abstract class Order {
    private double totalPrice;
    private Store store;
    private Product[] products;
    private CurrencyType currencyType;

    private static int countOrder=0;

    public Order(double totalPrice, Store store, Product[] products, CurrencyType currencyType) {
        this.totalPrice = totalPrice;
        this.store = store;
        this.products = products;
        this.currencyType = currencyType;
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

    public static int getCountOrder() {
        return countOrder;
    }

    public static void setCountOrder(int countOrder) {
        Order.countOrder = countOrder;
    }
}
