package Pasha.lesson9.lesson;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("TechStuffStore", 5.0);

        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Mouse", 29.99);
        Product[] products = {product1, product2};

        OrderService orderService = new OrderService();

        Order onlineOrder = new OnlineOrder(store, products, CurrencyType.USD, "Delivery Street st. 10");

        try {
            orderService.processOrder(onlineOrder);
            System.out.println("Delivery order is placed!");
            System.out.println("Total order value: " + onlineOrder.getTotalPrice() + " " + onlineOrder.getCurrencyType());
            System.out.println("Total order items: " + onlineOrder.getCountOrder(products));
        } catch (EmptyOrderException e) {
            System.out.println("Order has no items!" + e.getMessage());
        } catch (InvalidPriceException e) {
            System.out.println("Incorrect price!" + e.getMessage());
        } catch (DeliveryException e) {
            System.out.println("Delivery error!" + e.getMessage());
        } catch (CurrencyMismatchException e) {
            System.out.println("Incorrect currency!" + e.getMessage());
        }

        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();

        // Pick up order is commented out because of countOrder being a static value per task.


//        Order pickupOrder = new PickupOrder(store, products, CurrencyType.RUB);
//
//        try {
//            orderService.processOrder(pickupOrder);
//            System.out.println("Pick-up order is placed!");
//            System.out.println("Total order value: " + pickupOrder.getTotalPrice() + " " + pickupOrder.getCurrencyType());
//            System.out.println("Total order items: " + pickupOrder.getCountOrder(products));
//        } catch (EmptyOrderException e) {
//            System.out.println("Order has no items!" + e.getMessage());
//        } catch (InvalidPriceException e) {
//            System.out.println("Incorrect price!" + e.getMessage());
//        } catch (DeliveryException e) {
//            System.out.println("Delivery error!" + e.getMessage());
//        }
//        catch (CurrencyMismatchException e) {
//            System.out.println("Incorrect currency!" + e.getMessage());
//        }
    }
}
