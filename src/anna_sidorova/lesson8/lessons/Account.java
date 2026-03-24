package anna_sidorova.lesson8.lessons;

public abstract class Account {
    private double balance;
    private String accountType;
    private Bank bank;

    public Account(double balance, Bank bank, String accountType) {
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

    public String getAccountType() {
        return accountType;
    }

    public abstract boolean countBalance(double amount);

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
