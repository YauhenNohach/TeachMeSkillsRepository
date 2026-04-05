package EgorKhomchenko.Lesson11.Homework.Model;

import EgorKhomchenko.Lesson11.Homework.Exception.InsufficientBalanceException;

public class User {
    private long id;
    private String name;
    private double balance;

    public User(long id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Deposit amount must be non-negative");
        this.balance += amount;
    }


    public void withdraw(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Withdraw amount must be non-negative");
        if (this.balance < amount) {
            double shortfall = amount - this.balance;
            throw new InsufficientBalanceException(shortfall);
        }
        this.balance -= amount;
    }
}
