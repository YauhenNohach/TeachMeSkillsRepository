package EgorKhomchenko.Lesson9.Homework;

public class Store implements IStore {
    private String name;
    private double discountPercent;

    public Store(String name, double discountPercent) {
        this.name = name;
        this.discountPercent = discountPercent;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getDiscountPercent() {
        return discountPercent; }
    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent; }


    @Override
    public void applyDiscount(Order order) {
        if (order == null) return;
        double discount = discountPercent / 100.0;
        double newPrice = order.getTotalPrice() * (1.0 - discount);
        order.setTotalPrice(newPrice);
    }
}