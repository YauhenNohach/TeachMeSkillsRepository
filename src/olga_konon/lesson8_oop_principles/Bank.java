package olga_konon.lesson8_oop_principles;

public class Bank implements IBank {

    private String name;
    private double transferFeePercent;

    @Override
    public void deposit(double amount) {

    }

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
}


