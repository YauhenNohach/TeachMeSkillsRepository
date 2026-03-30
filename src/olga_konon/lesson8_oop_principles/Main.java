package olga_konon.lesson8_oop_principles;

public class Main {
    public static void main(String[] args) {

        //create Banks
        Bank bank1 = new Bank("PKO", 5);
        Bank bank2 = new Bank("PKO", 5);

        // Create two accounts
        Account savingCard = new SavingAccount(4000, bank1, AccountType.USD);
        Account creditCard = new CreditAccount(5000, bank2, 400, AccountType.EUR);

        //
        TransferMoney.transferMoneyBetweenAccounts(savingCard, creditCard, 600);


    }
}