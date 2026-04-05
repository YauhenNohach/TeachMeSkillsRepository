package veranika_slesarchyk.lesson11_collections_part1.HW.service;

import veranika_slesarchyk.lesson11_collections_part1.HW.model.Order;
import veranika_slesarchyk.lesson11_collections_part1.HW.payment.PaymentStrategy;

public class OrderService {
    public void checkout(Order order, PaymentStrategy payment) {
        double total = order.getTotalPrice();
        payment.pay(order.getUser(), total);
    }
}
