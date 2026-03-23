package Pasha.lesson8.lesson;

public class TransferMoney extends Bank {
    public TransferMoney(String name, double transferFeePercent) {
        super(name, transferFeePercent);
    }

    static void main(String[] args) {
        Bank bank1 = new Bank("bnk", 0.1);
        Bank bank2 = new Bank("bnk1", 0.2);
        CreditAccount creditAccount = new CreditAccount(120, bank1, 1000);
        SavingAccount savingAccount = new SavingAccount(1500, bank2);
        transferMoneyFromCreditAccToSavingAcc(creditAccount, savingAccount, bank1);
        System.out.println("Credit acc balance - " + creditAccount.balance);
        System.out.println("Saving acc balance - " + savingAccount.balance);
    }

    static void transferMoneyFromCreditAccToSavingAcc(CreditAccount creditAccount, SavingAccount savingAccount, Bank bank) {
        double transferMoney = bank.deposit(creditAccount.balance);
        if (!creditAccount.bank.name.equals(savingAccount.bank.name)) {
            double fee = transferMoney * creditAccount.bank.transferFeePercent;
            transferMoney -= fee;
            creditAccount.balance -= fee;
        }
        savingAccount.balance+=transferMoney;
        creditAccount.balance-=transferMoney;
        System.out.println(transferMoney + " were transfered from credit acc to saving acc.");
    }
}
