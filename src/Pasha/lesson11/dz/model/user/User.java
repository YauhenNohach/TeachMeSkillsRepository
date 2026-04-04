package Pasha.lesson11.dz.model.user;

import Pasha.lesson11.dz.exception.InsufficientFundsException;

public class User {
    private int id;
    private double balance;
    private String name;

    public User(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (this.balance < amount) {
            throw new InsufficientFundsException("Not enough funds in your balance!");
        }
        this.balance -= amount;
    }
}
