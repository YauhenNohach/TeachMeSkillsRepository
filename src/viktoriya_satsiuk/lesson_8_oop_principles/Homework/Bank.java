package viktoriya_satsiuk.lesson_8_oop_principles.Homework;

public class Bank implements IBank{
    private String name;
    private double transferFeePercent;


    public Bank(String name, double transferFeePercent) {
        this.name = name;
        this.transferFeePercent = transferFeePercent;
    }

    public void setTransferFeePercent(double transferFeePercent) {
        if (transferFeePercent >= 0) {
            this.transferFeePercent = transferFeePercent;
        }
    }


    @Override
    public void deposit(double amount, Account account) {
        double currentBalance = account.getBalance();
        account.setBalance(currentBalance + amount);
        System.out.println("Deposit " + amount + " was added " + account.getAccountType() + " to account " + name);
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
}
