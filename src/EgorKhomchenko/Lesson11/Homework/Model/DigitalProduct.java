package EgorKhomchenko.Lesson11.Homework.Model;

public class DigitalProduct extends Product{
    double fileSize;

    public DigitalProduct(String name, double price, long id, double fileSize) {
        super(name, price, id);
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
        return super.getPrice() + fileSize;
    }
}
