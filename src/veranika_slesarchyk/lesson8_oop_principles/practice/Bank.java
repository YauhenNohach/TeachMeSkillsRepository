package veranika_slesarchyk.lesson8_oop_principles.practice;

public class Bank implements IBank {
   private String name;
   private double transferFeePercent;

    public Bank(double transferFeePercent, String name) {
        this.transferFeePercent = transferFeePercent;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTransferFeePercent() {
        return transferFeePercent;
    }

    public void setTransferFeePercent(double transferFeePercent) {
        this.transferFeePercent = transferFeePercent;
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Пополнение на сумму: " + amount);
        }
    }
}
