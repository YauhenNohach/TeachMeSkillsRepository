package yanina_savich.lesson9_exceptions.lesson;

import yanina_savich.lesson9_exceptions.lesson.Model.IStore;

public class Store implements IStore {
    private String name;
    private double discountPercent;

    public Store(String name, double discountPercent) {
        this.name = name;
        this.discountPercent = discountPercent;
    }

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
        double discount = order.getTotalPrice() * discountPercent / 100;
        double priceWithDiscount = order.getTotalPrice() - discount;

        System.out.println("With discount price now: " + priceWithDiscount);
    }
}
