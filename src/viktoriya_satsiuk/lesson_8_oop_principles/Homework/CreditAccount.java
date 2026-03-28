package viktoriya_satsiuk.lesson_8_oop_principles.Homework;

public class CreditAccount extends Account{
    private double creditLimit;

    public CreditAccount(double balance, Bank bank, AccountType accountType, double creditLimit) {
        super(balance, bank, accountType);
        this.creditLimit = creditLimit;
    }


    public double getCreditLimit() {
        return creditLimit;
    }
}
