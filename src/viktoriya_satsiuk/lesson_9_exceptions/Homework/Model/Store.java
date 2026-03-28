package viktoriya_satsiuk.lesson_9_exceptions.Homework.Model;

public class Store implements IStore {
    private final String name;
    private final double discountPercent;


    public Store(String name, double discountPercent) {
        this.name = name;
        this.discountPercent = discountPercent;
    }

    public String getName() {
        return name;
    }


    @Override
    public void applyDiscount(Order order) {
        double newPrice = order.getTotalPrice() * (1 - discountPercent / 100);
        order.setTotalPrice(newPrice);
    }
}
