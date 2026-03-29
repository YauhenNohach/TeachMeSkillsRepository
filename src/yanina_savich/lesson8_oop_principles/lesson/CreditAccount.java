package yanina_savich.lesson8_oop_principles.lesson;

public class CreditAccount extends Account{
    private double creditLimit;

    public CreditAccount(double balance, Bank bank, String accountType, double creditLimit) {
        super(balance, bank, accountType);
        this.creditLimit = creditLimit;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
}
