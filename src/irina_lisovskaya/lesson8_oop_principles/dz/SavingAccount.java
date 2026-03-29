package irina_lisovskaya.lesson8_oop_principles.dz;

public class SavingAccount extends Account{

    public SavingAccount() {
    }

    public SavingAccount(double balance, Bank bank, String accountType) {
        super(balance, bank, accountType);
    }

}
