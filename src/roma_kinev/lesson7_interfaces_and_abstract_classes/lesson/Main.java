package roma_kinev.lesson7_interfaces_and_abstract_classes.lesson;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Alfa", 2.5);

        Account acc1 = new SavingAccount(bank, 1000);
        Account acc2 = new CreditAaccount(500, 500, bank);

        TransferMoney.transfer(acc1,acc2,200);

    }
}
