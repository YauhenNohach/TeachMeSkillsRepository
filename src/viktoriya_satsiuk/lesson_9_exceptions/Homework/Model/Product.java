package viktoriya_satsiuk.lesson_9_exceptions.Homework.Model;

import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.InvalidPriceException;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) throws InvalidPriceException {
        this.name = name;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InvalidPriceException {
        if (price<=0) {
            throw new InvalidPriceException("The price must be more than 0");
        }
        this.price = price;
    }


}

