package veranika_slesarchyk.lesson11_collections_part1.HW.payment;

import veranika_slesarchyk.lesson11_collections_part1.HW.model.User;

public class BalancePayment implements PaymentStrategy{

    @Override
    public void pay(User user, double amount) {
        user.withdraw(amount);
        System.out.println("Оплата прошла успешно. Списано: " + amount);
    }
}
