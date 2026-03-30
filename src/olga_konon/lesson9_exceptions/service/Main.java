package olga_konon.lesson9_exceptions.service;


import olga_konon.lesson9_exceptions.exceptions.CurrencyMismatchException;
import olga_konon.lesson9_exceptions.exceptions.DeliveryException;
import olga_konon.lesson9_exceptions.exceptions.EmptyOrderException;
import olga_konon.lesson9_exceptions.exceptions.InvalidPriceException;
import olga_konon.lesson9_exceptions.model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws EmptyOrderException, InvalidPriceException, DeliveryException, CurrencyMismatchException {

        OrderService orderService = new OrderService();
        // List of products
        Product product1 = new Product("Product1", 1.0);
        Product product2 = new Product("Product2", 105.0);
        Product product3 = new Product("Product3", 105.0);

        //array with products
        Product[] products = {product1, product2, product3};

        Store store1 = new Store("Store1", 5);

        // create online order
        OnlineOrder orderOnline = new OnlineOrder();
        orderOnline.setProducts(products);
        orderOnline.setStore(store1);
        orderOnline.setCurrencyType(CurrencyType.USD);
        orderOnline.setDeliveryAddress("Warsaw, Pereca 13, 00-859");

        // create pickup order
        PickupOrder orderPickup = new PickupOrder();
        orderPickup.setProducts(products);
        orderPickup.setStore(store1);
        orderPickup.setCurrencyType(CurrencyType.EUR);


        try {
            orderService.processOrder(orderOnline);
            System.out.println("List of products: " + Arrays.toString(products));
            System.out.println("Total order price: " + orderOnline.getTotalPrice() + " " + orderOnline.getCurrencyType());
        } catch (EmptyOrderException e) {
            System.out.println("Empty order: " + e.getMessage());
        } catch (InvalidPriceException e) {
            System.out.println("Price error: " + e.getMessage());
        } catch (DeliveryException e) {
            System.out.println("Delivery error: " + e.getMessage());
        } catch (CurrencyMismatchException e) {
            System.out.println("Currency error: " + e.getMessage());
        }

    }
}