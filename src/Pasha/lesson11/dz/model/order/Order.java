package Pasha.lesson11.dz.model.order;

import Pasha.lesson11.dz.model.product.Product;
import Pasha.lesson11.dz.model.user.User;
import java.util.ArrayList;
import java.util.List;


public class Order {
    private final User user;
    private final ArrayList<Product> products;

    public Order(User user) {
        this.user = user;
        this.products = new ArrayList<>();
    }

    public User getUser() {
        return user;
    }

    protected List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalSum();
        }
        return total;
    }
}
