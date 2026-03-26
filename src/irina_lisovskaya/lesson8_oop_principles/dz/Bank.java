package irina_lisovskaya.lesson8_oop_principles.dz;

public class Bank implements IBank {
    // fields
    private String name;
    private double transferFeePercent;

    // constructors
    public Bank(String name, double transferFeePercent) {
        this.name = name;
        this.transferFeePercent = transferFeePercent;
    }
    // methods


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
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Пополнение счёта в банке " + name + " на сумму: " + amount);
    }

}

