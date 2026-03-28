package Pasha.lesson8.lesson;

abstract class Account {
    double balance;
    Bank bank;
    AccountType accountCurrency;

    protected Account(double balance, Bank bank, AccountType accountCurrency) {
        this.balance = balance;
        this.bank = bank;
        this.accountCurrency=accountCurrency;
    }
}
