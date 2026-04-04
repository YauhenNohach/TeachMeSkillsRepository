package YanaRudinskaya.Lesson8;

public class Bank implements IBank {
    private String name;
    private double transferFeePercent;

    public Bank(String name, double transferFeePercent) {
        this.name = name;
        this.transferFeePercent = transferFeePercent;
    }

    public double getTransferFeePercent() {
        return transferFeePercent;
    }

    public void setTransferFeePercent(double transferFeePercent) {
        this.transferFeePercent = transferFeePercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Имя банка не может быть пустым");
        }
        this.name = name;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма депозита должна быть положительной");
        } else {
            System.out.println("Внесено на депозит " + amount + " в банк " + name);
        }
    }
}
