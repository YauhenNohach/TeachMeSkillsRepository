package anna_lyasota.lesson11_collections_part1.dz.model;

public class DigitalProduct extends Product{
    private double fileSize;

    public DigitalProduct(Integer id, String name, double price, double fileSize) {
        super(id, name, price);
        this.fileSize = fileSize;
    }

    public DigitalProduct(double fileSize) {
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
        return super.getPrice();
    }
}
