package irina_lisovskaya.lesson9_exceptions.dz;

import irina_lisovskaya.lesson9_exceptions.dz.exception.CurrencyMismatchException;
import irina_lisovskaya.lesson9_exceptions.dz.exception.DeliveryException;
import irina_lisovskaya.lesson9_exceptions.dz.exception.EmptyOrderException;
import irina_lisovskaya.lesson9_exceptions.dz.exception.InvalidPriceException;
import irina_lisovskaya.lesson9_exceptions.dz.model.CurrencyType;
import irina_lisovskaya.lesson9_exceptions.dz.model.OnlineOrder;
import irina_lisovskaya.lesson9_exceptions.dz.model.Product;
import irina_lisovskaya.lesson9_exceptions.dz.model.Store;
import irina_lisovskaya.lesson9_exceptions.dz.service.OrderService;

public class Main {
    public static void main(String[] args) {
        Store BikeStore = new Store("Bike Shop", 15);
        OrderService OrderService = new OrderService();

        Product bicycle = new Product("Bicycle", 700);
        Product helmet = new Product("Helmet", 120);
        Product chainWithLock = new Product("Chain with lock", 20);
        Product waterBottle = new Product("Water Bottle", 5);
        Product bikeHorn = new Product("Bike horn",8);

//  Онлайн заказ
        OnlineOrder order1 = new OnlineOrder();
        order1.setStore(BikeStore);
        order1.setCurrencyType(CurrencyType.EUR);
        order1.setDeliveryAddress("Бейкер-стрит, 221Б");
        order1.setProducts(new Product[]{bicycle, chainWithLock, bikeHorn});


        try {
            OrderService.processOrder(order1);
        } catch (
                EmptyOrderException e) {
            System.err.println("Заказ пуст: " + e.getMessage());
        } catch (
                InvalidPriceException e) {
            System.err.println("Ошибка цены: " + e.getMessage());
        } catch (
                DeliveryException e) {
            System.err.println("Ошибка доставки: " + e.getMessage());
        } catch (
                CurrencyMismatchException e) {
            System.err.println("Ошибка валюты: " + e.getMessage());
        }
    }
}
