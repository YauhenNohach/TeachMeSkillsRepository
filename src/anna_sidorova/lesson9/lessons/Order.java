package anna_sidorova.lesson9.lessons;

import anna_sidorova.lesson9.lessons.exceptions.EmptyOrderException;

import java.util.Currency;

public abstract class Order {
    private double totalPrice;
    Store store;
    Product[] products;
    CurrencyType currencyType;
    private static int countOrder = 0;

    public Order(double totalPrice, Store store, Product[] products, CurrencyType currencyType) {
        this.totalPrice = totalPrice;
        this.store = store;
        this.products = products;
        this.currencyType = currencyType;
        countOrder++;
    }


    public static void isNoProductsInOrder(int totalPrice) {
        if (totalPrice == 0) {
            try {
                throw new EmptyOrderException("Сумма заказа равна 0");
            } catch (EmptyOrderException e) {
                System.out.println("В заказе нет товаров: " + e.getMessage());
            }
        }

    }

    public static int getCountOrder() {
        return countOrder;
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
