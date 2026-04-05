package roma_kinev.lesson_11.dz.payment;

import roma_kinev.lesson_11.dz.exception.InsufficientFundsException;
import roma_kinev.lesson_11.dz.model.User;

public interface PaymentStrategy {
    void pay (User user, double amount) throws InsufficientFundsException;
}
