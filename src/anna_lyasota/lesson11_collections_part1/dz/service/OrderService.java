package anna_lyasota.lesson11_collections_part1.dz.service;

import anna_lyasota.lesson11_collections_part1.dz.model.Order;
import anna_lyasota.lesson11_collections_part1.dz.payment.PaymentStrategy;

public class OrderService {
    public void checkout(Order order, PaymentStrategy payment) {
        double totalPrice = order.getTotalPrice();
        payment.pay(order.getUser(), totalPrice);
    }
}
