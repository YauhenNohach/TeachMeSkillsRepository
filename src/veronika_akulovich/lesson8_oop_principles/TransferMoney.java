package veronika_akulovich.lesson8_oop_principles;

public class TransferMoney {

    public static void transferMoneyFromOneAccountToAnother (Account account1, Account account2, double amount) {
        double temporaryBalance = account1.getBalance() - amount;
        account1.setBalance(temporaryBalance);
        account2.setBalance(account2.getBalance() + amount);
    }

    public static void transferMoneyWithBankCommission (Account account1, Account account2, double amount) {
        if (account1.getBank().equals(account2.getBank())) {
            account1.setBalance(account1.getBalance() - amount);
        } else {
            account1.setBalance(account1.getBalance() - (amount / 100 * account1.getBank().getTransferFeePercent()) - amount);
        }
        account2.setBalance(account2.getBalance() + amount);
    }
}


