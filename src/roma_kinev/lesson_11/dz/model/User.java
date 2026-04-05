package roma_kinev.lesson_11.dz.model;

import roma_kinev.lesson_11.dz.exception.InsufficientFundsException;

public class User {

    private int id;
    private double balance;
    private String name;

    public User(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount){
            throw new InsufficientFundsException("Недостаточно средств на балансе ");
        }
        balance = balance - amount;
    }

    public void deposit(double amount){
        balance = balance + amount;
    };
}
