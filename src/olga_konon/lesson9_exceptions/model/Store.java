package olga_konon.lesson9_exceptions.model;

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

    }
}

