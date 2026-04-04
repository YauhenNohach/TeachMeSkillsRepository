package Pasha.lesson11.dz.model.product;

public class DigitalProduct extends Product {
    private double fileSize;

    public DigitalProduct(int id, String name, double price, double fileSize) {
        super(id, name, price);
        this.fileSize = fileSize;
    }

    protected double getFileSize() {
        return fileSize;
    }

    protected void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public double getTotalSum() {
        return super.getPrice();
    }
}
