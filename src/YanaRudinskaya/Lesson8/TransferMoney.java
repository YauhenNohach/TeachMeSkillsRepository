package YanaRudinskaya.Lesson8;

public class TransferMoney {

    public void transfer(Account from, Account to, double amount) {


        if (from == null || to == null) {
            System.out.println("Аккаунт не может быть null");
            return;
        }

        if (amount <= 0) {
            System.out.println("Сумма перевода должна быть больше нуля");
            return;
        }

        if (from.getBalance() < amount) {
            System.out.println("Недостаточно денег для перевода");
            return;
        }
// 7) если банки аккаунтов отличаются, то снимать комиссию за перевод указанную банком(поле transferFeePercent)
        double fee=amount*(from.getBank().getTransferFeePercent() / 100);
        if (!from.getBank().getName().equals(to.getBank().getName())) {
            from.setBalance = from.getBalance() - amount-fee;
            to.setBalance = to.getBalance() + amount-fee;
            System.out.println("Переведена сумма  " + (amount-fee) + " с " + from.getBank().getName() + " на " + to.getBank().getName()+". Комиссия: " + fee);
        }else {
// 6) создать новый класс для бизнес логики TransferMoney, в котором создать метод для перевода денег с одного аккаунта на другой
            from.setBalance = from.getBalance() - amount;
            to.setBalance = to.getBalance() + amount;
            System.out.println("Переведена сумма  " + amount + " с " + from.getBank().getName() + " на " + to.getBank().getName());
        }
    }
}
