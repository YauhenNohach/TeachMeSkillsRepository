package YanaRudinskaya.Lesson8;

public class Main {
    public static void main(String[] args) {

        Bank firstBank = new Bank("firstBank", 1.5);
        Bank secondBank = new Bank("secondBank", 2.0);

        SavingAccount firstAccount = new SavingAccount(500, firstBank, "BYN");
        CreditAaccount secondAccount = new CreditAaccount(100,secondBank,3000, "BYN");
        CreditAaccount thirdAccount = new CreditAaccount(100,firstBank,4000, "USD");

        TransferMoney transferMoney = new TransferMoney();


        transferMoney.transfer(firstAccount, secondAccount, 200);


    }
}
