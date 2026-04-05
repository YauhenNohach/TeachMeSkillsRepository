package anna_lyasota.lesson11_collections_part1.dz.service;

import anna_lyasota.lesson11_collections_part1.dz.exception.NotEnoughBalanceException;

public class User {
    private Integer id;
    private double balance;
    private String name;

    public User(Integer id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    double userSum=5.0;
    //методы withdraw (списание с баланса) и deposit (пополнение баланса).
    // Внутри withdraw нужно реализовать проверку если баланс меньше суммы,
    // которую юзер пытается списать, то пробросить свое исключение
    public void withdraw(double amount) {
        if (this.balance < amount) {
            throw new NotEnoughBalanceException("Недостаточно средств");
        }
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

}
