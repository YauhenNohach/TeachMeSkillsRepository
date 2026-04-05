package roma_kinev.lesson_11.dz.model;

public class DigitalProduct extends Product {

    private double fileSize;

    public DigitalProduct(int id, String name, double price, double fileSize) {
        super(id, name, price);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public double getTotalSum() {
        return getPrice() + fileSize * 0.1;
    }
}
