package irina_lisovskaya.lesson9_exceptions.dz.model;

import irina_lisovskaya.lesson9_exceptions.dz.model.IStore;
import irina_lisovskaya.lesson9_exceptions.dz.model.Order;

public class Store implements IStore {
    // свойства
    private String name;
    private double discountPercent;

    // конструкторы
    public Store() {
    }

    public Store(String name, double discountPercent) {
        this.name = name;
        this.discountPercent = discountPercent;
    }


    // методы

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void applyDiscount(Order order) {
        double price = order.getTotalPrice();
        double newPrice = price - (price * (this.discountPercent / 100));
        order.setTotalPrice(newPrice);
    }

}
