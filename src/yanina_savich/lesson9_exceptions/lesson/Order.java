package yanina_savich.lesson9_exceptions.lesson;

import yanina_savich.lesson9_exceptions.lesson.exception.CurrencyMismatchException;
import yanina_savich.lesson9_exceptions.lesson.exception.EmptyOrderException;
import yanina_savich.lesson9_exceptions.lesson.exception.InvalidPriceException;

public abstract class Order {
    private double totalPrice;
    private Store store;
    private Product[] products;
    private CurrencyType currencyType;

    private static int countOrder;



    public Order(){
        countOrder++;
    }

    public Order(Product[] products, Store store, CurrencyType currencyType) {
    }


    public void checkProducts() {
        if (products == null || products.length == 0) {
            throw new EmptyOrderException("Ниодного продукта не добавлено!!!");
        }
    }
    public void checkPrice(){
        if (totalPrice <= 0){
            throw new InvalidPriceException("Цена не может быть отрицательной!!!");
        }
    }
    public void checkCurrency(){
        if (currencyType == null){
            throw new CurrencyMismatchException("Валюта не поддерживается!!!");
        }
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

    public void processOrder(){
    }
}
