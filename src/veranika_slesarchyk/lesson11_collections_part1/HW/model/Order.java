package veranika_slesarchyk.lesson11_collections_part1.HW.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private User user;
    private List<Product> products = new ArrayList<>();

    public Order(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

 //   метод addProduct (добавление продукта в список)
 //products — это List<Product>
//product — объект, который передается в метод
 public void addProduct(Product product) {
     products.add(product);
     if (product == null) {
         throw new IllegalArgumentException("Product is null");
     }
 }
//   метод getTotalPrice (рассчитать итоговую  стоимость всего списка продуктов)
public double getTotalPrice() {
    double sum = 0;
    for (int i = 0; i < products.size(); i++) {
        Product p = products.get(i);
        sum += p.getTotalSum();
    }
    return sum;
}

}
