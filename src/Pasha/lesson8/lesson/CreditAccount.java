package Pasha.lesson8.lesson;

public class CreditAccount extends Account {
    double creditLimit;

    protected CreditAccount(double balance, Bank bank, double creditLimit, String accountCurrency) {
        super(balance, bank, accountCurrency);
        this.creditLimit = creditLimit;
    }
}
