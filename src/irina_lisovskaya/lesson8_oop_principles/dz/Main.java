package irina_lisovskaya.lesson8_oop_principles.dz;

public class Main {
    public static void main(String[] args) {
        Bank alfa = new Bank("Alfa", 2);
        Bank bnb = new Bank("BNB", 0);

        Account myCard1 = new CreditAccount(1500, alfa, "USD", 500);
        Account myCard2 = new SavingAccount(500, bnb, "USD");

        TransferMoney service = new TransferMoney();

        service.transfer(myCard1, myCard2, 300);
    }
}
