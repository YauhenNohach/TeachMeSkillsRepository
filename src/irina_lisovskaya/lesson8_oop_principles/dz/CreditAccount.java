package irina_lisovskaya.lesson8_oop_principles.dz;

public class CreditAccount extends Account {
    // fields
    private double creditLimit;

// constructors
    public CreditAccount(){
    }

    public CreditAccount(double balance, Bank bank, String accountType, double creditLimit) {
        super(balance, bank, accountType);
        this.creditLimit = creditLimit;
    }

    // methods
    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean canWithdraw(double amount) {
        return (getBalance() + creditLimit) >= amount;
    }
}
