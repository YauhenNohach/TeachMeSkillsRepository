package yanina_savich.lesson8_oop_principles.lesson;

public abstract class Account {
    private double balance;
    private Bank bank;
    private String accountType;

    protected Account(double balance, Bank bank, String accountType) {
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

    public void deposit(double amount){
        balance += amount;
        bank.deposit(amount);
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void writeOff(double amount){
        balance -= amount;
    }
}
