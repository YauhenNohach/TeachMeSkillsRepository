package yanina_savich.lesson11_collections_part1.hm.model.order;


import yanina_savich.lesson11_collections_part1.hm.exeption.InsufficientFundsException;
import yanina_savich.lesson11_collections_part1.hm.model.product.Product;
import yanina_savich.lesson11_collections_part1.hm.model.user.User;
import yanina_savich.lesson11_collections_part1.hm.payment.PaymentStrategy;

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

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public double getTotalPrice(){
        double total = 0;
        for (Product product : products){
            total += product.getTotalSum();
        }
        return total;
    }
    public void payOrder(PaymentStrategy paymentStrategy) throws InsufficientFundsException {
        double total = getTotalPrice();
        paymentStrategy.pay(user, total);
    }

}
