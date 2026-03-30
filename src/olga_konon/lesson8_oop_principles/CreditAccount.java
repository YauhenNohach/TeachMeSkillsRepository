package olga_konon.lesson8_oop_principles;

public class CreditAccount extends Account {

    private double creditLimit;

    public CreditAccount(double balance, Bank bank, double creditLimit, AccountType accountType) {
        super(balance, bank, accountType);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

}
