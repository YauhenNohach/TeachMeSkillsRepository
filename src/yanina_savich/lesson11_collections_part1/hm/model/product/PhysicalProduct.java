package yanina_savich.lesson11_collections_part1.hm.model.product;

public class PhysicalProduct extends Product {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getTotalSum() {
        return getPrice() + weight * 2;
    }
}
