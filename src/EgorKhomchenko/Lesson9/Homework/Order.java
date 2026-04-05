package EgorKhomchenko.Lesson9.Homework;

import EgorKhomchenko.Lesson9.Homework.Enums.CurrencyType;

public abstract class Order {
    private double totalPrice;
    private Store store;
    private Product[] products;
    private CurrencyType currencyType;


    private static int countOrder = 0;

    protected Order(double totalPrice, Store store, Product[] products, CurrencyType currencyType) {
        this.totalPrice = totalPrice;
        this.store = store;
        this.products = products == null ? new Product[0] : products.clone();
        this.currencyType = currencyType;
        countOrder++;
    }


    public double getTotalPrice() {
        return totalPrice; }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice; }

    public Store getStore() {
        return store; }
    public void setStore(Store store) {
        this.store = store; }

    public Product[] getProducts() {
        return products.clone(); }
    public void setProducts(Product[] products) {
        this.products = products == null ? new Product[0] : products.clone(); }

    public CurrencyType getCurrencyType() {
        return currencyType; }
    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType; }

    public static int getCountOrder() {
        return countOrder; }
}
