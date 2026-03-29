package anna_lyasota.lesson8_oop_principles.lesson;

public class Main {
    public static void main(String[] args) {

        //task 6
        Account acc1 = new SimpleAccount();
        acc1.setBalance(1000);

        Account acc2 = new SavingAccount();
        acc2.setBalance(500);

        TransferMoney transfer = new TransferMoney();
        transfer.transfer(acc1, acc2, 200);

        TransferMoney transferfee = new TransferMoney();
        transferfee.transfer(acc1, acc2, 200);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());

    }
}
