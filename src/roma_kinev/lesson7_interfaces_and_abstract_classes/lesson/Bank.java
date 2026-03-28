package roma_kinev.lesson7_interfaces_and_abstract_classes.lesson;

public class Bank implements IBank{

    private String name;
    private double transferFeePercent;

    public Bank(String name, double transferFeePercent) {
        this.name = name;
        this.transferFeePercent = transferFeePercent;
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
        System.out.println("В банк " + name + " внесено: " + amount);
    }
}
