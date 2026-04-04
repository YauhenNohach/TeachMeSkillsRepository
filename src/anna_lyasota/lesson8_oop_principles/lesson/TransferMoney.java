package anna_lyasota.lesson8_oop_principles.lesson;

public class TransferMoney {

// метод принимает два аккаунта и сумма перевода
    //сумму денег отнимаем у одного аккаунта и передаем другому
    //экземпляр создаем в мейн

    public void transfer(Account account1, Account account2, double amount) {
        account1.setBalance(account1.getBalance() - amount);
        account2.setBalance(account2.getBalance() + amount);
        System.out.println("Перевод выполнен");


    }

    public void transferfee(Account from, Account to, double amount) {

        double fee = 0;

        // если банки разные — считаем комиссию
        if (from.getBank() != to.getBank()) {
            fee = amount * from.getBank().getTransferFeePercent() / 100;
        }

        double total = amount + fee;

        from.setBalance(from.getBalance() - total);
        to.setBalance(to.getBalance() + amount);

        System.out.println("Перевод выполнен. Комиссия: " + fee);
}
}