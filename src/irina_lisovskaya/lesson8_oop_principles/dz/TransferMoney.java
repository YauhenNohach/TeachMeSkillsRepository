package irina_lisovskaya.lesson8_oop_principles.dz;

public class TransferMoney{
    public void transfer(Account from, Account to, double amount) {
        double fee = 0;
        if (!from.getBank().getName().equals(to.getBank().getName())) {
            fee = amount * (from.getBank().getTransferFeePercent() / 100);
        }
        double totalToWithdraw = amount + fee;

        if (!from.canWithdraw(totalToWithdraw)) {
            System.err.println("Недостаточно средств.");
            return;
        }
        from.withdraw(totalToWithdraw);
        to.getBank().deposit(to, amount);

        System.out.println("Перевод выполнен успешно.");
        System.out.println("Сумма перевода: " + amount + " " + from.getAccountType());
        System.out.println("Комиссия банка (" + from.getBank().getName() + "): " + fee + " " + from.getAccountType());

        System.out.println("\n--- Баланс после транзакции ---");
        System.out.println("Банк [" + from.getBank().getName() + "], Счет отправителя: " + from.getBalance());
        System.out.println("Банк [" + to.getBank().getName() + "], Счет получателя: " + to.getBalance());
    }
}
