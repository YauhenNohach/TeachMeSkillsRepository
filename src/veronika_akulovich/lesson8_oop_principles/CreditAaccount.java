package veronika_akulovich.lesson8_oop_principles;

public class CreditAaccount extends Account{
    double creditLimit;

    public CreditAaccount() {
    }

    public CreditAaccount(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public CreditAaccount(double balance, Bank bank, double creditLimit) {
        super(balance, bank);
        this.creditLimit = creditLimit;
    }
}
