package anna_lyasota.lesson11_collections_part1.dz.model;

import anna_lyasota.lesson11_collections_part1.dz.service.User;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private User user;
    private List<Product> products = new ArrayList<>();

    public Order(User user) {
        this.user = user;
    }

    public Order() {
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

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double total2 = 0;
        for (Product product : products) {
            total2 += product.getTotalSum();
        }
        return total2;
    }
}
