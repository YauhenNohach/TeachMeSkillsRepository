package yanina_savich.lesson9_exceptions.lesson;

import yanina_savich.lesson9_exceptions.lesson.exception.InvalidPriceException;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        if (price <= 0){
            throw new InvalidPriceException("Цена не может быть меньше 0!");
        }
        this.name = name;
        this.price = price;
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

    public void setPrice(double price) {
        this.price = price;
    }
}
