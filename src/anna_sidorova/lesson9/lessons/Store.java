package anna_sidorova.lesson9.lessons;

public class Store implements IStore {
    private String name;
    private double discountPercent;

    public Store(String name, double discountPercent) {
        this.name = name;
        this.discountPercent = discountPercent;
    }

    public Store(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public void applyDiscount(Order order) {

    }
}
