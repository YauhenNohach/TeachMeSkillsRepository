package Pasha.lesson8.lesson;

abstract class Account {
    double balance;
    Bank bank;

    public Account(double balance, Bank bank) {
        this.balance = balance;
        this.bank = bank;
    }
}
