package anna_sidorova.lesson11.dz.model.product;

public class DigitalProduct extends Product {
    private double fileSize;

    public DigitalProduct(int id, String name, double price, double fileSize) {
        super(id, name, price);
        this.fileSize = fileSize;
    }

    @Override
    double getTotalSum(double price) {
        return super.getPrice() + fileSize * 2;
    }
}
