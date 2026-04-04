package Pasha.lesson11.dz.payment;


import Pasha.lesson11.dz.exception.InsufficientFundsException;
import Pasha.lesson11.dz.model.user.User;

public class BalancePayment implements PaymentStrategy {
    @Override
    public void pay(User user, double amount) throws InsufficientFundsException {
        user.withdraw(amount);
        System.out.println("Payment sucessfull! Withdrawn: " + amount + " | Current balance: " + user.getBalance());
    }
}
