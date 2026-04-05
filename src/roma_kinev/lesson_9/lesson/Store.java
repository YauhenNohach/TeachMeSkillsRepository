package roma_kinev.lesson_9.lesson;

public class Store implements IStore {

    private String name;
    private double discountPercent;

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

    public Store(String name, double discountPercent) {
        this.name = name;
        this.discountPercent = discountPercent;
    }

    @Override
    public void applyDiscount(Order order) {
        double discount = order.getTotalPrice() * (discountPercent / 100);
        order.setTotalPrice(order.getTotalPrice() - discount);

        System.out.println("Скидка применена: " + discount);
    }
}
