package anna_sidorova.lesson11.dz.model.order;

import anna_sidorova.lesson11.dz.model.product.Product;
import anna_sidorova.lesson11.dz.model.user.User;

import java.util.ArrayList;
import java.util.List;

public class Order {
    User user = new User();
    List<Product> products;

    public Order() {
    }

    public Order(User user) {
        this.user = user;
    }

    public Order(List<Product> products) {
        this.products = products;
    }

    public Order(User user, List<Product> products) {
        this.user = user;
        this.products = products;
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

    //добавление продукта в список
    public void addProduct(Product product) {
        if (products == null) {
            products = new ArrayList<>();
            products.add(product);
        }
    }

    //рассчитать итоговую  стоимость всего списка продуктов
    public double getTotalPrice() {
        if (products == null) {
            return 0;
        }
        double totalPrice = 0;
        for (Product product : products) {
            if (getProducts() != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }

}
