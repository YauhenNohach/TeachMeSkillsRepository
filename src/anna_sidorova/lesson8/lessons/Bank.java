package anna_sidorova.lesson8.lessons;

import com.sun.source.tree.BreakTree;

public class Bank implements IBank {
    private String name;
    private double transFreePercent;

    public Bank(String name, double transFreePercent) {
        this.name = name;
        this.transFreePercent = transFreePercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTransFreePercent() {
        return transFreePercent;
    }

    public void setTransFreePercent(double transFreePercent) {
        this.transFreePercent = transFreePercent;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Банк получил депозит " + amount);

    }

    public boolean checkBankName(Account from, Account to, double amount) {
        double fee = 0;
        if (!from.getBank().getName().equals(to.getBank().getName())) {
            fee = amount * from.getBank().getTransFreePercent() / 100;
        }

        double totalAmount = amount + fee;
        if (!from.countBalance(totalAmount)) {
            return false;
        }
        return false;
    }
}
