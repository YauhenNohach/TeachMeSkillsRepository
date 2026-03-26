package veranika_slesarchyk.lesson8_oop_principles.practice;

//6) создать новый класс для бизнес логики TransferMoney, в котором создать метод для перевода денег с одного аккаунта на другой
public class TransferMoney {
    public static void transfer (Account from, Account to, double amount) {
        double finalAmount = amount;

        // 7. Если банки разные — снимаем комиссию
        if (!from.getBank().equals(to.getBank())) {
            double fee = amount * from.getBank().getTransferFeePercent() / 100;
            finalAmount -= fee;
            System.out.println("Снята комиссия: " + fee);
        }

        // Проверка баланса и выполнение перевода
        if (from.getBalance() >= amount ||
                (from instanceof CreditAccount && from.getBalance() + ((CreditAccount) from).getcreditLimit() >= amount)) {

            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + finalAmount);

            System.out.println("Перевод выполнен: " + finalAmount);
        } else {
            System.out.println("Недостаточно средств для перевода");
        }
    }
    }
