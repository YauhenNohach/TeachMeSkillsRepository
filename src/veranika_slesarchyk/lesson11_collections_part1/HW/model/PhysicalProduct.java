package veranika_slesarchyk.lesson11_collections_part1.HW.model;

public class PhysicalProduct extends Product {
    private double weight;

    public PhysicalProduct(int id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    @Override
    public double getTotalSum() {
        return getPrice() + weight * 2;
    }
}
