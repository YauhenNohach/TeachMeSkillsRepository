package yanina_savich.lesson8_oop_principles.lesson;

public class Bank implements IBank {
    private String name;
    private double transferFreePercent;
    private double sumBalance;

    public Bank(String name, double transferFreePercent) {
        this.name = name;
        this.transferFreePercent = transferFreePercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTransferFreePercent() {
        return transferFreePercent;
    }

    public void setTransferFreePercent(double transferFreePercent) {
        this.transferFreePercent = transferFreePercent;
    }

    @Override
    public void deposit(double amount) {
        sumBalance += amount;
        System.out.println("В банк " + name + "внесено: " + amount);
    }
}
