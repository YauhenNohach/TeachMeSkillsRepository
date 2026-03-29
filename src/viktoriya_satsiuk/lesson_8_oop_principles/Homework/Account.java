package viktoriya_satsiuk.lesson_8_oop_principles.Homework;

public abstract class Account {
    private double balance;
    private Bank bank;
    private AccountType accountType;

    public Account(double balance, Bank bank, AccountType accountType) {
        this.balance = balance;
        this.bank = bank;
        this.accountType = accountType;
    }

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

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
