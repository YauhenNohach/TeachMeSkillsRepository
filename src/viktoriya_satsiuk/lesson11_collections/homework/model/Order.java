package viktoriya_satsiuk.lesson11_collections.homework.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private User user;
    private final List<Product> products;

    public Order(User user) {
        this.products = new ArrayList<>();
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    //Добавление продукта в список
    public void addProduct(Product newProduct) {
        this.products.add(newProduct);
    }

    //получение стоимости всех продуктов
    public double getTotalPrice() {
        double sum = 0;
        for (Product a : this.products) {
            sum +=a.getTotalSum();
        }
        return sum;
    }

}

