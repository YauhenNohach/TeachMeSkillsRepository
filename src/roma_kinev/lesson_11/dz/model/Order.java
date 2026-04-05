package roma_kinev.lesson_11.dz.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private User user;
    private List<Product> products;

    public Order(User user) {
        this.user = user;
        this.products = new ArrayList<>();
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

    public void addProduct(Product product){
        products.add(product);
    }

    public double getTotalPrice(){
        double total = 0;
        for (Product product : products){
            total = total + product.getTotalSum();
        }
        return total;
    }
}
