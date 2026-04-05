package anna_sidorova.lesson11.dz.model.user;

import anna_sidorova.lesson11.dz.exception.NobalanceException;

public class User {

    private int id;
    private double balance;
    private String name;


    public User() {
    }

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

    public void withdraw(double amount) throws NobalanceException {
        if (amount > this.balance) {
            throw new NobalanceException("Сумма списания превышает сумму баланса " + amount);
        }
        this.balance -= amount;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма пополнения должна быть больше 0");
        }
        this.balance += amount;
    }
}
