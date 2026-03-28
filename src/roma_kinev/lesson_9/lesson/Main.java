package roma_kinev.lesson_9.lesson;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Хлеб", 2);
        Product p2 = new Product("Молоко", 3);

        Product[] products = {p1, p2};

        Store store = new Store("Магазин 1", 10);

        Order order = new OnlineOrder(0, store, products, CurrencyType.EUR, "Улица 1");

        OrderService service = new OrderService();
        try {
            service.processOrder(order);
        } catch (EmptyOrderException e){
            System.out.println("Заказ пуст " + e.getMessage());
        } catch (InvalidPriceException e){
            System.out.println("Ошибка цены " + e.getMessage());
        } catch (DeliveryException e){
            System.out.println("Ощибка досьавки " + e.getMessage());
        } catch (CurrencyMismatchException e){
            System.out.println("Ошибка валюты " + e.getMessage());
        }
    }
}
