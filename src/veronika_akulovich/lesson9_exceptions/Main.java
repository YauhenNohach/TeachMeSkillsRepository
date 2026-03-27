package veronika_akulovich.lesson9_exceptions;

import veronika_akulovich.lesson9_exceptions.exception.CurrencyMismatchException;
import veronika_akulovich.lesson9_exceptions.exception.DeliveryException;
import veronika_akulovich.lesson9_exceptions.exception.EmptyOrderException;
import veronika_akulovich.lesson9_exceptions.exception.InvalidPriceException;

public class Main {
    static void main(String[] args) {

        Product sneakers = new Product("sneakers", 1000.6);
        Product hat = new Product("hat", 150.5);
        Product dress = new Product("dress", 1500.5);

        Product[] products = {sneakers, hat, dress};

        OrderService orderService = new OrderService();
        Store gippo = new Store("gippo", 10);

        Order order1 = new OnlineOrder(0.0, gippo, products, CurrencyType.EUR, "Аксай 2 микрорайон, 48");


        try {
            orderService.processOrder(order1);
        } catch (EmptyOrderException e) {
            System.err.println("Заказ пуст: " + e.getMessage());
        } catch (InvalidPriceException e) {
            System.err.println("Ошибка цены: " + e.getMessage());
        } catch (DeliveryException e) {
            System.err.println("Ошибка доставки: " + e.getMessage());
        } catch (CurrencyMismatchException e) {
            System.err.println("Ошибка валюты: " + e.getMessage());
        }
    }
}
