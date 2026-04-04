package veronika_akulovich.lesson7_interfaces_and_abstract_classes.forPractice;

public class Hats extends Product{

    String forSex;

    public Hats() {
    }

    public Hats(String forSex) {
        this.forSex = forSex;
    }

    public Hats(double price, boolean isOnTheStorage, String size, String forSex) {
        super(price, isOnTheStorage, size);
        this.forSex = forSex;
    }

    @Override
    public String toString() {
        return "Hats{" +
                "forSex='" + forSex + '\'' +
                ", price=" + price +
                ", isOnTheStorage=" + isOnTheStorage +
                ", size='" + size + '\'' +
                '}';
    }
}
