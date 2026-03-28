package roma_kinev.lesson7_interfaces_and_abstract_classes.lesson;

public class TransferMoney {

    public static void transfer (Account from, Account to, double amount){

        double feePercent = from.getBank().getTransferFeePercent();
        double fee = amount * feePercent / 100;
        double total = amount * fee;

        if (from.getBalance() < total){
            System.out.println("Недостаточно средств для перевода!");
            return;
        }

        from.setBalance(from.getBalance() - total);
        to.setBalance(to.getBalance() + amount);

        System.out.println("Перевод выполнен:");
        System.out.println("Отправлено: " + amount + " (комиссия: " + fee + ")");
        System.out.println("Новый баланс отправителя: " + from.getBalance());
        System.out.println("Новый баланс получателя: " + to.getBalance());
    }
}
