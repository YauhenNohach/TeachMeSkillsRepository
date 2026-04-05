package yanina_savich.lesson11_collections_part1.hm.payment;

import yanina_savich.lesson11_collections_part1.hm.exeption.InsufficientFundsException;
import yanina_savich.lesson11_collections_part1.hm.model.user.User;

public class BalancePayment implements PaymentStrategy {
    @Override
    public void pay(User user, double amount) throws InsufficientFundsException {
        user.withdraw(amount);
    }
}
