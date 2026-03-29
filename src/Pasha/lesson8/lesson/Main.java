package Pasha.lesson8.lesson;

public class Main {

    public void main() {
        Bank bank1 = new Bank("bnk1", 0.1);
        bank1.setTransferFeePercent(0.05);
        Bank bank2 = new Bank("bnk2", 0.2);
        bank1.setTransferFeePercent(0.03);
        CreditAccount creditAccount = new CreditAccount(120, bank1, 1000, AccountType.EUR);
        SavingAccount savingAccount = new SavingAccount(1500, bank2, AccountType.USD);
        TransferMoney.transferMoneyFromCreditAccToSavingAcc(creditAccount, savingAccount, bank1);
        System.out.println("Credit acc balance - " + creditAccount.balance);
        System.out.println("Saving acc balance - " + savingAccount.balance);
    }
}
