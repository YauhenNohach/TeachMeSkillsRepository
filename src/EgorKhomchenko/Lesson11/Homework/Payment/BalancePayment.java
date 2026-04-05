package EgorKhomchenko.Lesson11.Homework.Payment;

import EgorKhomchenko.Lesson11.Homework.Model.User;

import java.util.Objects;

public class BalancePayment implements PaymentStrategy {

    @Override
    public void pay(User user, double amount) {
        Objects.requireNonNull(user, "user must not be null");
        if (amount < 0) throw new IllegalArgumentException("amount must be non-negative");
        user.withdraw(amount);
    }
}

