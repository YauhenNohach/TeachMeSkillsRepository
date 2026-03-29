package EgorKhomchenko.Lesson8.Homework;

public class CreditAccount extends Account {
    private double creditLimit;

    public CreditAccount(Bank bank, double initialBalance, Currency accountType, double creditLimit) {
        super(bank, initialBalance, accountType);
        setCreditLimit(creditLimit);
    }

    public double getCreditLimit() {

        return creditLimit;
    }

    public final void setCreditLimit(double creditLimit) {
        if (creditLimit < 0) throw new IllegalArgumentException("creditLimit must be >= 0");
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("withdraw amount must be > 0");
        double available = getBalance() + creditLimit;
        if (amount > available) return false;
        setBalance(getBalance() - amount);
        return true;
    }
}