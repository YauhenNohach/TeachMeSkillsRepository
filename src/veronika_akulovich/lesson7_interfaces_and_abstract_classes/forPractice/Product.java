package veronika_akulovich.lesson7_interfaces_and_abstract_classes.forPractice;

public  class Product {


    double price;
    boolean isOnTheStorage;
    String size;

    public Product() {
    }

    public Product(double price, boolean isOnTheStorage, String size) {
        this.price = price;
        this.isOnTheStorage = isOnTheStorage;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOnTheStorage() {
        return isOnTheStorage;
    }

    public void setOnTheStorage(boolean onTheStorage) {
        isOnTheStorage = onTheStorage;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
