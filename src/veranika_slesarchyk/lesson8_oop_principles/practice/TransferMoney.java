package veranika_slesarchyk.lesson8_oop_principles.practice;

//6) создать новый класс для бизнес логики TransferMoney, в котором создать метод для перевода денег с одного аккаунта на другой
public class TransferMoney {

    public static void transfer(Account from, Account to, double amount) {

        double finalAmount = amount;

        // если банки разные → комиссия
        if (!from.getBank().getName().equals(to.getBank().getName())) {
            double fee = amount * from.getBank().getTransferFeePercent() / 100;
            finalAmount = amount - fee;
        }

        // проверка для кредитного аккаунта
        if (from instanceof CreditAccount) {
            CreditAccount ca = (CreditAccount) from;

            if (from.getBalance() + ca.getCreditLimit() < amount) {
                System.out.println("Недостаточно средств с учетом кредита");
                return;
            }
        } else {
            if (from.getBalance() < amount) {
                System.out.println("Недостаточно средств");
                return;
            }
        }

        // списание
        from.setBalance(from.getBalance() - amount);

        // зачисление
        to.setBalance(to.getBalance() + finalAmount);

        System.out.println("Перевод выполнен");
    }
}

