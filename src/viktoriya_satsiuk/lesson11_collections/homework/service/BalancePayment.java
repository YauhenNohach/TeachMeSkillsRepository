package viktoriya_satsiuk.lesson11_collections.homework.service;

import viktoriya_satsiuk.lesson11_collections.homework.model.User;
import viktoriya_satsiuk.lesson11_collections.homework.payment.PaymentStrategy;

public class BalancePayment implements PaymentStrategy {
    @Override
    public void pay(User user, double amount) {
        user.withdraw(amount);
    }
}
