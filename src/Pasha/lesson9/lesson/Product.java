package Pasha.lesson9.lesson;

public class Product {
    private String name;
    private double price;

    protected Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }
}
