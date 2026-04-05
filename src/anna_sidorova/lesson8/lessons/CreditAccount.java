package anna_sidorova.lesson8.lessons;

public class CreditAccount extends Account {
    double creditLimit;

    public CreditAccount(double balance, Bank bank, String accountType, double creditLimit) {
        super(balance, bank, accountType);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public boolean countBalance(double amount) {
        if (amount <= getBalance() + creditLimit) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
}
