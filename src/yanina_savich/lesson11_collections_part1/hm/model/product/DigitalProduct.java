package yanina_savich.lesson11_collections_part1.hm.model.product;

public class DigitalProduct extends Product {
    double fileSize;

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public double getTotalSum() {
        return getPrice() + fileSize * 1;

    }
}
