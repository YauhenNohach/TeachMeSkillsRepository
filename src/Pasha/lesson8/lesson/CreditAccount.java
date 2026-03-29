package Pasha.lesson8.lesson;

public class CreditAccount extends Account {
    double creditLimit;

    protected CreditAccount(double balance, Bank bank, double creditLimit, AccountType accountCurrency) {
        super(balance, bank, accountCurrency);
        this.creditLimit = creditLimit;
    }
}
