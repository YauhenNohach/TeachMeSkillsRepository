package veranika_slesarchyk.lesson8_oop_principles.practice;

public class Account {
    private double balance;
    private Bank bank;
    private String accountType; // "USD", "EUR", "RUB"

    public Account(double balance, Bank bank) {
        this.balance = balance;
        this.bank = bank;
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
