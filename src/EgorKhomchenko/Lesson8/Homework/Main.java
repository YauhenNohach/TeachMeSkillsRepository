package EgorKhomchenko.Lesson8.Homework;

public class Main {
    public static void main(String[] args) {
        Bank bankA = new Bank("BankA", 1.0);
        Bank bankB = new Bank("BankB", 2.5);

        SavingAccount acc1 = new SavingAccount(bankA, 1000.0, Currency.USD);
        CreditAccount acc2 = new CreditAccount(bankA, 200.0, Currency.USD, 500.0);
        SavingAccount acc3 = new SavingAccount(bankB, 50.0, Currency.USD);

        System.out.println("Initial:");
        System.out.println("acc1 = " + acc1);
        System.out.println("acc2 = " + acc2);
        System.out.println("acc3 = " + acc3);

        TransferMoney svc = new TransferMoney();

        // Внутренний перевод
        boolean ok1 = svc.transfer(acc1, acc2, 300.0);
        System.out.println("\nInternal transfer acc1->acc2 300.0 : " + ok1);
        System.out.println("acc1 = " + acc1);
        System.out.println("acc2 = " + acc2);

        // Межбанковский перевод
        boolean ok2 = svc.transfer(acc1, acc3, 500.0);
        System.out.println("\nCross-bank transfer acc1->acc3 500.0 : " + ok2);
        System.out.println("acc1 = " + acc1);
        System.out.println("acc3 = " + acc3);

        // Перевод с использованием кредитного лимита
        boolean ok3 = svc.transfer(acc2, acc3, 800.0);
        System.out.println("\nTransfer using credit acc2->acc3 800.0 : " + ok3);
        System.out.println("acc2 = " + acc2);
        System.out.println("acc3 = " + acc3);
    }
}
