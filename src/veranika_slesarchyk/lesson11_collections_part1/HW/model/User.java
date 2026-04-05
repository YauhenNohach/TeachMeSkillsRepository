package veranika_slesarchyk.lesson11_collections_part1.HW.model;

import veranika_slesarchyk.lesson11_collections_part1.HW.exception.InsufficientBalanceException;

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
//списание с баланса
    public void withdraw(double amount) {
        if (balance < amount) {
            throw new InsufficientBalanceException("Недостаточно средств");
        }
        balance -= amount;
        System.out.println(balance);
    }

    //пополнение баланса
    public void deposit(double amount) {
        balance += amount;
        System.out.println(balance);
    }
}
