package anna_sidorova.lesson8.lessons;

public class SavingAccount extends Account {

    double savingLimit;


    public SavingAccount(double balance, Bank bank, String accountType) {
        super(balance, bank, accountType);
    }

    @Override
    public boolean countBalance(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
}
