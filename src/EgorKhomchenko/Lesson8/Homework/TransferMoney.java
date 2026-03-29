package EgorKhomchenko.Lesson8.Homework;

public class TransferMoney {

    public boolean transfer(Account from, Account to, double amount) {
        if (from == null || to == null) throw new IllegalArgumentException("accounts must not be null");
        if (amount <= 0) throw new IllegalArgumentException("amount must be > 0");

        // проверка валют
        if (from.getAccountType() != to.getAccountType()) {
            throw new IllegalArgumentException("Account currency/type mismatch");
        }

        double fee = 0.0;
        if (!from.getBank().getName().equals(to.getBank().getName())) {
            fee = amount * (from.getBank().getTransferFeePercent() / 100.0);
        }

        double totalDebit = amount + fee;

        boolean withdrawn = from.withdraw(totalDebit);
        if (!withdrawn) {
            return false;
        }

        to.deposit(amount);


        return withdrawn;
    }
}