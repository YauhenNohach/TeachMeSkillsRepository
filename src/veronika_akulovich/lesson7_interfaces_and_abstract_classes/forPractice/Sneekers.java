package veronika_akulovich.lesson7_interfaces_and_abstract_classes.forPractice;

public class Sneekers extends  Product{

    double  lengthInsole;

    public Sneekers() {
    }

    public Sneekers(double lengthInsole) {
        this.lengthInsole = lengthInsole;
    }

    public Sneekers(double price, boolean isOnTheStorage, String size, double lengthInsole) {
        super(price, isOnTheStorage, size);
        this.lengthInsole = lengthInsole;
    }

    @Override
    public String toString() {
        return "Sneekers{" +
                "lengthInsole=" + lengthInsole +
                ", price=" + price +
                ", isOnTheStorage=" + isOnTheStorage +
                ", size='" + size + '\'' +
                '}';
    }
}
