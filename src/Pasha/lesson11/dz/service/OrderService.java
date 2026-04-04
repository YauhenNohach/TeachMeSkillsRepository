package Pasha.lesson11.dz.service;


import Pasha.lesson11.dz.exception.InsufficientFundsException;
import Pasha.lesson11.dz.model.order.Order;
import Pasha.lesson11.dz.payment.PaymentStrategy;

public class OrderService {
    public void checkout(Order order, PaymentStrategy payment) {
        double totalAmount = order.getTotalPrice();
        System.out.println("Forming your order. " +
                "\nYour total is: " + totalAmount + " \u20C1.");

        try {
            payment.pay(order.getUser(), totalAmount);
            System.out.println("Order was created!");
        } catch (
                InsufficientFundsException e) {
            System.out.println("Payment error: " + e.getMessage());
            System.out.println("Order has been cancelled.");
        }
    }
}