package anna_sidorova.lesson8.lessons;

public class TransferMoney {

    public static boolean transferMoney(Account from, Account to, double amount) {
        double fee = 0;
        if (amount <= 0) {
            System.out.println("Ошибка перевода. Нельзя перевести меньше 0!");
        }
        if (!from.getBank().getName().equals(to.getBank().getName())) {
            fee = amount * from.getBank().getTransFreePercent() / 10;
        }

        double totalAmount = amount + fee;

        if (!from.countBalance(totalAmount)) {
            return false;
        }

        to.deposit(amount);

        return true;
    }
}

