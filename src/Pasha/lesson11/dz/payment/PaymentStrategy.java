package Pasha.lesson11.dz.payment;

import Pasha.lesson11.dz.exception.InsufficientFundsException;
import Pasha.lesson11.dz.model.user.User;

public interface PaymentStrategy {
    void pay(User user, double amount) throws InsufficientFundsException;
}