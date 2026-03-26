package veranika_slesarchyk.lesson8_oop_principles.practice;

public class MainforBank {
    public static void main(String[] args) {
        Bank bankA = new Bank(2.0, "Bank A");
        Bank bankB = new Bank(3.0, "Bank B");

        Account creditAcc = new CreditAccount(100, bankA, 200);
        Account savingAcc = new SavingAccount(50, bankB);

        TransferMoney.transfer(creditAcc, savingAcc, 80);

        System.out.println("Баланс отправителя: " + creditAcc.getBalance());
        System.out.println("Баланс получателя: " + savingAcc.getBalance());
    }
}
