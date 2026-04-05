package veranika_slesarchyk.lesson8_oop_principles.practice;

public class CreditAccount extends Account{
    private double creditLimit;

    public CreditAccount(double balance, Bank bank, double creditLimit) {
        super(balance, bank);
        this.creditLimit = creditLimit;
    }

    public double getcreditLimit() {
        return 0;
    }
}
