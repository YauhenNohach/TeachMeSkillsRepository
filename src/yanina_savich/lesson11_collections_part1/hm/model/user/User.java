package yanina_savich.lesson11_collections_part1.hm.model.user;

import yanina_savich.lesson11_collections_part1.hm.exeption.InsufficientFundsException;
import yanina_savich.lesson11_collections_part1.hm.exeption.InvalidAmountException;

public class User {
    private int id;
    private double balance;
    private String name;

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
        if (balance < amount) {
            throw new InsufficientFundsException("Not enough money");
        }
        balance -= amount;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Сумма не может быть отрицательной!!!");
        }
            balance += amount;
        }
    }


