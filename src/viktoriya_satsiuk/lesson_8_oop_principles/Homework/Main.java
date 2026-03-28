package viktoriya_satsiuk.lesson_8_oop_principles.Homework;

public class Main {
    public static void main(String[] args) {
        Bank firstBank = new Bank("First bank", 2);
        Bank secondBank = new Bank("Second bank", 1);

        CreditAccount firstAccount = new CreditAccount
                (100, secondBank, AccountType.RUB, 200);
        CreditAccount secondAccount = new CreditAccount
                (50, firstBank, AccountType.RUB, 500);

        //Неуспешная попытка перевода
        System.out.println("Trying to transfer 200 RUB");
        System.out.println("First Account balance before: " + firstAccount.getBalance());
        System.out.println("Second Account balance before: " + secondAccount.getBalance());
        TransferMoney.transferMoneyBetweenAccounts(firstAccount, secondAccount, 200.0);
        System.out.println("First Account balance after: " + firstAccount.getBalance());
        System.out.println("Second Account balance: " + secondAccount.getBalance());

        //Успешная попытка перевода
        System.out.println("Second attempt");
        System.out.println("First Account balance before: " + firstAccount.getBalance());
        System.out.println("Second Account balance before: " + secondAccount.getBalance());
        TransferMoney.transferMoneyBetweenAccounts(firstAccount, secondAccount, 20.0);
        System.out.println("First Account balance after: " + firstAccount.getBalance());
        System.out.println("Second Account balance: " + secondAccount.getBalance());
    }
}
