package roma_kinev.lesson_11.dz.model;

public class PhysicalProduct extends Product {

    private double weight;

    public PhysicalProduct(int id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getTotalSum() {
        return super.getPrice() + weight * 2;
    }
}
