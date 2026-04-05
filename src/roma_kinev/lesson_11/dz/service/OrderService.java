package roma_kinev.lesson_11.dz.service;

import roma_kinev.lesson_11.dz.exception.InsufficientFundsException;
import roma_kinev.lesson_11.dz.model.Order;
import roma_kinev.lesson_11.dz.payment.PaymentStrategy;

public class OrderService {
    public void checkout(Order order, PaymentStrategy payment){
        double total = order.getTotalPrice();
        try{
            payment.pay(order.getUser(), total);
            System.out.println("Оплата прошла успешно! Сумма: " + total);
        } catch (InsufficientFundsException e){
            System.out.println("Ошибка оплаты: " + e.getMessage());
        }
    }
}
