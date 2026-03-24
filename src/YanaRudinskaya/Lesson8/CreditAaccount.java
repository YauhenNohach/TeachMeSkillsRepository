package YanaRudinskaya.Lesson8;

public class CreditAaccount extends Account {
    private double creditLimit;

    public CreditAaccount(double balance, Bank bank, double creditLimit, String accountType) {
        super(balance, bank,accountType);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
