package irina_lisovskaya.lesson9_exceptions.dz.model;

public class Product {
    // свойства
    private String name;
    private double price;

    // конструкторы
    public Product() {

    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // методы
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
