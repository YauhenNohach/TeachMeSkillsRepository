package Pasha.lesson8.lesson;

public class TransferMoney {

    protected static void transferMoneyFromCreditAccToSavingAcc(CreditAccount creditAccount, SavingAccount savingAccount, Bank bank) {
        double transferMoney = bank.deposit(creditAccount.balance);
        double fee = transferMoney * creditAccount.bank.getTransferFeePercent();
        if (!creditAccount.bank.getName().equals(savingAccount.bank.getName())) {
            transferMoney -= fee;
        }
        creditAccount.balance-=(transferMoney+fee);
        savingAccount.balance+=transferMoney;
        System.out.println(transferMoney + " were transfered from credit acc to saving acc.");
    }
}
