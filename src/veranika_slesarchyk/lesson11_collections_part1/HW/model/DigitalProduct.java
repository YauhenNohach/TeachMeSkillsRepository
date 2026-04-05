package veranika_slesarchyk.lesson11_collections_part1.HW.model;

public class DigitalProduct extends Product {
    private double fileSize;

    public DigitalProduct(int id, String name, double price, double fileSize) {
        super(id, name, price);
        this.fileSize = fileSize;
    }

    @Override // например логика: цена + надбавка
    public double getTotalSum() {
        return getPrice() + fileSize;
    }
}
