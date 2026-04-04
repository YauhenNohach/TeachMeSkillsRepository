package veronika_akulovich.lesson8_oop_principles;

public class SavingAccount extends Account{
    public SavingAccount() {
    }

    public SavingAccount(double balance, Bank bank) {
        super(balance, bank);
    }
}
