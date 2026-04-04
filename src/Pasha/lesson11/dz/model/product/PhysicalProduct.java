package Pasha.lesson11.dz.model.product;

public class PhysicalProduct extends Product {
    private double weight;

    public PhysicalProduct(int id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    protected double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getTotalSum() {
        return super.getPrice() + (weight * 2);
    }
}
