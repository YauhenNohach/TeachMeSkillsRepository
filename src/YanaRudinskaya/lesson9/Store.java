package YanaRudinskaya.lesson9;

public class Store implements IStore{

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
        double price = order.getTotalPrice();
        double discount = this.discountPercent;
        double newPrice = price - (price * discount / 100);
        order.setTotalPrice(newPrice);
    }
}
