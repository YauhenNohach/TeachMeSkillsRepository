package EgorKhomchenko.Lesson8.Homework;

public abstract class Account {
    private double balance;
    private Bank bank;
    private Currency accountType; // enum

    public Account(Bank bank, double initialBalance, Currency accountType) {
        setBank(bank);
        setBalance(initialBalance);
        setAccountType(accountType);
    }

    public Bank getBank() {
        return bank;
    }

    public final void setBank(Bank bank) {
        if (bank == null) throw new IllegalArgumentException("bank must not be null");
        this.bank = bank;
    }

    public double getBalance() {

        return balance;
    }

    protected final void setBalance(double balance) {

        this.balance = balance;
    }

    public Currency getAccountType() {

        return accountType;
    }

    public final void setAccountType(Currency accountType) {
        if (accountType == null) throw new IllegalArgumentException("accountType required");
        this.accountType = accountType;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("deposit amount must be > 0");
        this.balance += amount;
    }


    public boolean withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("withdraw amount must be > 0");
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "Account{bank=" + bank.getName() + ", balance=" + balance + ", type=" + accountType + "}";
    }
}
