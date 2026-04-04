package veronika_akulovich.lesson8_oop_principles;

public class Main {
    static void main(String[] args) {
        Bank bank1 = new Bank("Belarusbank",10.0);
        Bank bank2 = new Bank("Priorbank",10.0);
        Account account1 = new SavingAccount(120000.00, bank1);
        Account account2 = new SavingAccount(130000.00, bank2);

        TransferMoney.transferMoneyWithBankCommission(account1, account2, 12000);
        System.out.println("Баланс аккаунта 1: " + account1.getBalance() + " Баланс аккаунта 2: " + account2.getBalance());

    }
}
