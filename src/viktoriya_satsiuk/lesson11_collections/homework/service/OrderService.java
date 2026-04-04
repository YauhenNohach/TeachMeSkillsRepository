package viktoriya_satsiuk.lesson11_collections.homework.service;

import viktoriya_satsiuk.lesson11_collections.homework.model.Order;
import viktoriya_satsiuk.lesson11_collections.homework.payment.PaymentStrategy;

public class OrderService {
    public void checkout(Order order, PaymentStrategy payment) {
        double total = order.getTotalPrice();
        payment.pay(order.getUser(), total);
    }
}
