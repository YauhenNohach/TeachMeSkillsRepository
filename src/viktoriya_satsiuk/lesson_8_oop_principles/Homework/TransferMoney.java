package viktoriya_satsiuk.lesson_8_oop_principles.Homework;

public class TransferMoney {
    public static void transferMoneyBetweenAccounts(Account from, Account to, double amount) {
        double totalToWithdraw = amount;
        // считаем комиссию если банки отличаются
        if (from.getBank() != to.getBank()) {
            double fee = amount * (from.getBank().getTransferFeePercent() / 100);
            totalToWithdraw += fee;
            System.out.println("Fee is: " + fee);
        }
        if (from.getBalance() >= totalToWithdraw) {
            from.setBalance(from.getBalance() - totalToWithdraw);
            to.setBalance(to.getBalance() + amount);
            System.out.println("Transfer of:  " + amount + " is completed.");
        } else {
            System.out.println("Not enough money for transfer (need: " + totalToWithdraw + ")");
        }
    }
}
