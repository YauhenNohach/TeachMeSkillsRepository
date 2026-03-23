package Pasha.lesson8.lesson;

public class CreditAccount extends Account{
    double creditLimit;

    public CreditAccount(double balance, Bank bank, double creditLimit) {
        super(balance, bank);
        this.creditLimit = creditLimit;
    }
}
