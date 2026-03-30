package olga_konon.lesson8_oop_principles;

public class TransferMoney {

    public static void transferMoneyBetweenAccounts(Account from, Account to, double amount) {

        double fee = 0.0;
        System.out.println("Amount without Fee: " + amount);

        // check bank fee
        // Сравнивать объекты или сравнивать имена?
        if (!from.getBank().getName().equals(to.getBank().getName())) {
            fee = amount * from.getBank().getTransferFeePercent() / 100;
            amount += fee;
        }
        System.out.println("Amount with Fee: " + amount);
        System.out.println("Fee: " + fee);

        //  check negative balance
        if ((Double.compare(from.getBalance(), amount) < 0)) {
            System.out.println("Not enough money");
        } else {

            // set up new balance
            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);

            System.out.println("Balance FROM account: " + from.getBalance());
            System.out.println("Balance to account: " + to.getBalance());
        }


    }


}
