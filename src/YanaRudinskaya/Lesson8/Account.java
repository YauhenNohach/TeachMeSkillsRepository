package YanaRudinskaya.Lesson8;

public abstract class Account {
    public double setBalance;
    private double balance;
    private Bank bank;
    private String accountType;

    public Account(double balance, Bank bank, String accountType) {
        this.balance = balance;
        this.bank = bank;
        this.accountType = accountType;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
