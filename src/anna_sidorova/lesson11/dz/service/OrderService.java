package anna_sidorova.lesson11.dz.service;

import anna_sidorova.lesson11.dz.exception.NobalanceException;
import anna_sidorova.lesson11.dz.model.order.Order;
import anna_sidorova.lesson11.dz.model.user.User;


public class OrderService {

    public void checkout(Order order, PaymentStrategy payment) {
        if (order == null || payment == null) {
            throw new NobalanceException("Операция невозможна!");
        }
        double total = order.getTotalPrice();
        payment.pay(order.getUser(), total);
    }
}
