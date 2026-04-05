package veranika_slesarchyk.lesson8_oop_principles.practice;

public class Account {
    private double balance;
    private Bank bank;
    public String accountType; // "USD", "EUR", "RUB"

    public Account(double balance, Bank bank, String accountType) {
        this.balance = balance;
        this.bank = bank;
        this.accountType = this.accountType;
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
