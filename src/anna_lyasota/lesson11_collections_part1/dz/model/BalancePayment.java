package anna_lyasota.lesson11_collections_part1.dz.model;

import anna_lyasota.lesson11_collections_part1.dz.payment.PaymentStrategy;
import anna_lyasota.lesson11_collections_part1.dz.service.User;

public class BalancePayment implements PaymentStrategy {

    @Override
    public void pay(User user, double amount) {
        user.withdraw(amount);
    }
}
