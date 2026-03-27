package veronika_akulovich.lesson9_exceptions;

public class Store implements IStore {
    private String name;
    private double discountPercent;

    public Store() {
    }

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
        order.setTotalPrice(order.getTotalPrice() - (order.getTotalPrice() / 100 * discountPercent));
    }
}
