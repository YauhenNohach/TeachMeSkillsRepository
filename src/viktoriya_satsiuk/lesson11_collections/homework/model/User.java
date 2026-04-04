package viktoriya_satsiuk.lesson11_collections.homework.model;

import viktoriya_satsiuk.lesson11_collections.homework.exception.InsufficientFundsException;

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

    //Списание с баланса
    public void withdraw(double amount) {
        // Кидаем исключение если баланс негативный
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        // Кидаем исключение если баланс меньше суммы
        if (this.balance < amount) {
            throw new InsufficientFundsException("Transaction failed: Insufficient balance");
        }
        balance -=amount;
    }

    //Пополнение баланса
    public void deposit(double amount) {
        // Кидаем исключение если сумма негативная
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        this.balance += amount;
    }

}
