package Lera_Grubrina.Lesson9;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        Store store = new Store("CatStore", 10.0);

        Product phone = new Product("iPhone 15", 999.0);
        Product casePhone = new Product("Чехол", 20.0);

        Product[] products = {phone, casePhone};

        Order order = new OnlineOrder(store, products, CurrencyType.EUR, "улица Тисовая, дом 4");

        System.out.println("Начинаем обработку заказа...");

        try {
            orderService.processOrder(order);

            System.out.println("Заказ успешно обработан!");
            System.out.println("Магазин: " + order.getStore().getName());
            System.out.println("Итоговая сумма (со скидкой и доставкой): " + order.getTotalPrice() + " " + order.getCurrencyType());
            System.out.println("Всего заказов создано в системе: " + Order.countOrder);

            if (order instanceof OnlineOrder) {
                System.out.println("Адрес доставки: " + ((OnlineOrder) order).getDeliveryAddress());
            }

        } catch (EmptyOrderException e) {
            System.out.println("Заказ пуст: " + e.getMessage());
        } catch (InvalidPriceException e) {
            System.out.println("Ошибка цены: " + e.getMessage());
        } catch (DeliveryException e) {
            System.out.println("Ошибка доставки: " + e.getMessage());
        } catch (CurrencyMismatchException e) {
            System.out.println("Ошибка валюты: " + e.getMessage());
        }
    }
}

