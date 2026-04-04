package Pasha.lesson11.dz.model.product;

public abstract class Product {
    private int id;
    private String name;
    private double price;

    protected Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
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

    public abstract double getTotalSum();
}
