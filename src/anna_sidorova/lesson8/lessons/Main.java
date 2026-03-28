package anna_sidorova.lesson8.lessons;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Selhoz", 3);
        Bank bank2 = new Bank("Tinkoff", 3);
        Account acc1 = new CreditAccount(1000, bank1, "USD", 500);
        Account acc2 = new SavingAccount(500, bank2, "USD");
        boolean result = TransferMoney.transferMoney(acc1, acc2, 200);
        System.out.println("Transfer success: " + result);
        System.out.println("Acc1 balance: " + acc1.getBalance());
        System.out.println("Acc2 balance: " + acc2.getBalance());
        boolean isbankName = bank1.checkBankName(acc1, acc2, 100);
        System.out.println("Is bank name the similar : " + isbankName);


    }
}
