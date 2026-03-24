package yanina_savich.lesson8_oop_principles.lesson;

public class TransferMoney {
    protected static void transfer(Account from, Account to, double amount) {
        if (!from.getAccountType().equals(to.getAccountType())){
            System.out.println("Разная валюта! Нельзя перевести");
            return;
        }

        double commission = 0;

        if (!from.getBank().equals(to.getBank())){
            commission = amount * from.getBank().getTransferFreePercent()/100;
        }
        double totalAmount = amount + commission;
        // списать
        from.writeOff(totalAmount);
        // зачислить
        to.deposit(amount);

        System.out.println("Перевод выполнен успешно!");
        System.out.println("Сумма перевода: " + amount);
        System.out.println("Коммисия: " + commission);
    }
}
