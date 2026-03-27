package veronika_akulovich.lesson8_oop_principles;

public abstract class Account {

    private double balance;
    private Bank bank;
    private AccountType accountType;

    public Account() {
    }

    public Account(double balance, Bank bank) {
        this.balance = balance;
        this.bank = bank;
    }

    public double getBalance() {
        if (balance <= 0) {
            System.out.println("Простите, вам нужно пополнить ваш баланс ");
        }
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
