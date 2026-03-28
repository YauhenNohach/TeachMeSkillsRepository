package roma_kinev.lesson7_interfaces_and_abstract_classes.lesson;

public abstract class Account {

    private double balance;
    private Bank bank;

    public Account(Bank bank, double balance) {
        this.balance = balance;
        this.bank = bank;
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

}
