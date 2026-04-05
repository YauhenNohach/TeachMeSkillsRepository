package anna_sidorova.lesson11.dz;

import anna_sidorova.lesson11.dz.exception.NobalanceException;
import anna_sidorova.lesson11.dz.model.product.Product;
import anna_sidorova.lesson11.dz.model.user.User;
import anna_sidorova.lesson11.dz.service.PaymentStrategy;

public class BalancePayment implements PaymentStrategy {
    @Override
    public void pay(User user, double amount) {
        if (user.getBalance() < amount) {
            throw new NobalanceException("Недостаточно средств!");
        }
        user.setBalance(user.getBalance() - amount);
        System.out.println("Оплата прошла успешно. Новый баланс: " + user.getBalance());
    }
}
