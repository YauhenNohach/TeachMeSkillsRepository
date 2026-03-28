package Pasha.lesson9.lesson;

public class Store implements IStore {
    private String name;
    private double discountPercent;

    protected Store(String name, double discountPercent) {
        this.name = name;
        this.discountPercent = discountPercent;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected double getDiscountPercent() {
        return discountPercent;
    }

    protected void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void applyDiscount(Order order) {
        double currentTotal = order.getTotalPrice();
        double discountedTotal = currentTotal - (currentTotal * (discountPercent / 100.0));
        order.setTotalPrice(discountedTotal);
    }
}
