package anna_lyasota.lesson9_exceptions.lesson;

import anna_lyasota.lesson9_exceptions.lesson.model.IStore;

public class Store implements IStore {
    String name;
    double discountPercent;

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
