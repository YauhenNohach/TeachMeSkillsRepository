package irina_lisovskaya.lesson8_oop_principles.dz;

public abstract class Account {
    // fields
    private double balance;
    private Bank bank;
    private String accountType; // USD, EUR, RUB

    // constructors

    public Account() {
    }

    public Account(double balance, Bank bank, String accountType) {
        this.balance = balance;
        this.bank = bank;
        this.accountType = accountType;
    }

    // methods

    public double getBalance() {
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

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // как то нужно проверить, а хватает ли вообще на аккаунте денег для снятия
    public boolean canWithdraw(double amount) {
        return balance >= amount;

    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

}
