package Lera_Grubrina.Lesson9;

public class Store implements IStore {
    private String name;
    private double discountPercent;

    public Store(String name, double discountPercent) {
        this.name = name;
        this.discountPercent = discountPercent;
    }

    @Override
    public void applyDiscount(Order order) {
        double currentPrice = order.getTotalPrice();
        double finalPrice = currentPrice - (currentPrice * (discountPercent / 100));
        order.setTotalPrice(finalPrice);
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
}
