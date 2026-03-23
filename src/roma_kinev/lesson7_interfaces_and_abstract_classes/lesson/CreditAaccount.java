package roma_kinev.lesson7_interfaces_and_abstract_classes.lesson;

public class CreditAaccount extends Account{

    double creditLimit;

    public CreditAaccount(double creditLimit, double balance, Bank bank) {
        super(bank, balance);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
