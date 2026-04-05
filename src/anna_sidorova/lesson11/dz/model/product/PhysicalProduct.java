package anna_sidorova.lesson11.dz.model.product;

public class PhysicalProduct extends Product {

    private double weight;

    public PhysicalProduct(int id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    @Override
    double getTotalSum(double price) {
        return super.getPrice() + weight * 2;
    }
}
