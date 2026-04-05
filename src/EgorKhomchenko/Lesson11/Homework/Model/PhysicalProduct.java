package EgorKhomchenko.Lesson11.Homework.Model;

public class PhysicalProduct extends Product{
    double weight;


    public PhysicalProduct(String name, double price, long id, double weight) {
        super(name, price, id);
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
