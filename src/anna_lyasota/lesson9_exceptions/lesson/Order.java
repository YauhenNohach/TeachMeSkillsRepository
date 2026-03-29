package anna_lyasota.lesson9_exceptions.lesson;

public abstract class Order {
    private double totalPrice;
    private Store store;
    private Product[] products;
    private CurrencyType currencyType;

    public static int countOrder;

    public Order() {
        products = new Product[1];
        //5) внтури класса Order создать статическое поле int countOrder и подсчитывать сколько заказов создано
        countOrder++;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }


}
