package Lera_Grubrina.Lesson8;

public class SavingAccount extends Account {

    public SavingAccount(double balance, Bank bank) {
        super(balance, bank);
    }

    @Override
    public void printAccountInfo() {
        System.out.println("Сберегательный счет в банке: " + getBank().getName());
        System.out.println("Текущий баланс: " + getBalance());
    }
}

