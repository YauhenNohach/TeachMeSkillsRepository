package EgorKhomchenko.Lesson11.Homework.Service;

import EgorKhomchenko.Lesson11.Homework.Exception.InsufficientBalanceException;
import EgorKhomchenko.Lesson11.Homework.Model.Order;
import EgorKhomchenko.Lesson11.Homework.Payment.PaymentStrategy;

import java.util.Objects;

public class OrderService {

    public boolean checkout(Order order, PaymentStrategy payment) {
        Objects.requireNonNull(order, "order must not be null");
        Objects.requireNonNull(payment, "payment strategy must not be null");

        double total = order.getTotalPrice();

        try {
            payment.pay(order.getUser(), total);

            return true;
        } catch (InsufficientBalanceException e) {

            return false;
        }
    }
}
