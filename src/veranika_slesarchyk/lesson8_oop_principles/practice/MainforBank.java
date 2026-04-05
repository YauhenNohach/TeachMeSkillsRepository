package veranika_slesarchyk.lesson8_oop_principles.practice;

public class MainforBank {
    public static void main(String[] args) {
        Bank bank1 = new Bank(5, "BankA");
        Bank bank2 = new Bank(10, "BankB");

        Account acc1 = new CreditAccount(1000, bank1, "USD", 500);
        Account acc2 = new SavingAccount(500, bank2, "USD");

        TransferMoney.transfer(acc1, acc2, 300);

        System.out.println("Acc1: " + acc1.getBalance());
        System.out.println("Acc2: " + acc2.getBalance());
    }
}
