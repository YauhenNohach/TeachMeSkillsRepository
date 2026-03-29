package EgorKhomchenko.Lesson8.Homework;

public class Bank implements IBank {
    private String name;
    private double transferFeePercent;

    public Bank(String name, double transferFeePercent) {
        setName(name);
        setTransferFeePercent(transferFeePercent);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("name must not be empty");
        this.name = name.trim();
    }

    public double getTransferFeePercent() {
        return transferFeePercent;
    }

    public final void setTransferFeePercent(double transferFeePercent) {
        if (transferFeePercent < 0) throw new IllegalArgumentException("transferFeePercent must be >= 0");
        this.transferFeePercent = transferFeePercent;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("deposit amount must be > 0");
        System.out.println("Bank '" + name + "' received deposit/fee: " + amount);
    }

    @Override
    public String toString() {

        return "Bank{name='" + name + "', transferFeePercent=" + transferFeePercent + "}";
    }
}
