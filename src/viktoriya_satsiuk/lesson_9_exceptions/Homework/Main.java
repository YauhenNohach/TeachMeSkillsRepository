package viktoriya_satsiuk.lesson_9_exceptions.Homework;

import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.CurrencyMismatchException;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.DeliveryException;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.EmptyOrderException;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.InvalidPriceException;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Model.CurrencyType;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Model.OnlineOrder;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Model.Product;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Model.Store;
import viktoriya_satsiuk.lesson_9_exceptions.Homework.Service.OrderService;

public class Main {
    public static void main(String[] args) {
        try {
            //Создаём магазин
            Store productStore = new Store("Product store", 3);

            //Создаём продукты
            Product milk = new Product("Milk", 20.45);
            Product bread = new Product("Bread", 15.10);
            Product cheese = new Product("Cheese", 50.99);
            Product tea = new Product("Tea", 9.20);

            Product[] products = {milk, bread, cheese, tea};

            //Вызываем InvalidPriceException
//            Product sugar = new Product("Sugar", -5.0);

            //Вызываем DeliveryException
//            OnlineOrder errorOrder = new OnlineOrder(productStore, products, CurrencyType.RUB, "");
//            OrderService.processOrder(errorOrder);

            //Вызываем EmptyOrderException
//            Product[] emptyCart = new Product[0];
//            OnlineOrder emptyOrder = new OnlineOrder(productStore, emptyCart, CurrencyType.RUB, "Minsk");
//            OrderService.processOrder(emptyOrder);

            // Вызываем CurrencyMismatchException
//            OnlineOrder noCurrencyOrder = new OnlineOrder(productStore, products, null, "Minsk");
//            OrderService.processOrder(noCurrencyOrder);

            OnlineOrder newOrder = new OnlineOrder
                    (productStore, products, CurrencyType.RUB, "Minsk");

            OrderService.processOrder(newOrder);
            System.out.printf("Final price is: %.2f%n", newOrder.getTotalPrice());

        } catch (
                EmptyOrderException e) {
            System.out.println("Order is empty: " + e.getMessage());
        } catch (
                InvalidPriceException e) {
            System.out.println("Price error: " + e.getMessage());
        } catch (
                DeliveryException e) {
            System.out.println("Delivery error: " + e.getMessage());
        } catch (
                CurrencyMismatchException e) {
            System.out.println("Currency error: " + e.getMessage());
        }
    }
}
