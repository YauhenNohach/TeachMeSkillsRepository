package Pasha.lesson8.lesson;

abstract class Account {
    double balance;
    Bank bank;
    String accountCurrency;

    protected Account(double balance, Bank bank, String accountCurrency) {
        this.balance = balance;
        this.bank = bank;
        this.accountCurrency=accountCurrency;
    }
}
