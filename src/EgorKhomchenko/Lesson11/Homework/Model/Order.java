package EgorKhomchenko.Lesson11.Homework.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Order {
    private final User user;
    private final List<Product> products = new ArrayList<>();

    public Order(User user) {
        this.user = Objects.requireNonNull(user, "user must not be null");
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }


    public void addProduct(Product product) {
        products.add(Objects.requireNonNull(product, "product must not be null"));
    }


    public double getTotalPrice() {
        return products.stream()
                .mapToDouble(Product::getTotalSum)
                .sum();
    }

}
