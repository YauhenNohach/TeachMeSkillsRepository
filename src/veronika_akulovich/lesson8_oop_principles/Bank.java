package veronika_akulovich.lesson8_oop_principles;

public class Bank implements IBank {
    private String name;
    private double transferFeePercent;

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

    }

    public Bank() {
    }

    public Bank(String name, double transferFeePercent) {
        this.name = name;
        this.transferFeePercent = transferFeePercent;
    }

    public boolean equals(Bank bank) {
        return this.name.equals(bank.name);
    }
}
