package veronika_akulovich.lesson7_interfaces_and_abstract_classes.forPractice;

public class Dresses extends Product{

    String color;

    public Dresses() {
    }

    public Dresses(String color) {
        this.color = color;
    }

    public Dresses(double price, boolean isOnTheStorage, String size, String color) {
        super(price, isOnTheStorage, size);
        this.color = color;
    }
    public String printInfoAboutDress() {
        return  "color='" + color + '\'' + ", price=" + price + ", isOnTheStorage=" + isOnTheStorage + ", size='" + size + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Dresses{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", isOnTheStorage=" + isOnTheStorage +
                ", size='" + size + '\'' +
                '}';
    }
}
