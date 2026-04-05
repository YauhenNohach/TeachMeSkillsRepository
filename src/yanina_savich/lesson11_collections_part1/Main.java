package yanina_savich.lesson11_collections_part1;

import yanina_savich.lesson11_collections_part1.hm.model.order.Order;
import yanina_savich.lesson11_collections_part1.hm.model.product.DigitalProduct;
import yanina_savich.lesson11_collections_part1.hm.model.product.PhysicalProduct;
import yanina_savich.lesson11_collections_part1.hm.model.user.User;
import yanina_savich.lesson11_collections_part1.hm.payment.BalancePayment;
import yanina_savich.lesson11_collections_part1.hm.payment.PaymentStrategy;
import yanina_savich.lesson11_collections_part1.hm.service.OrderService;

public class Main {
    public static void main(String[] args){
        User user = new User();
        user.setId(1);
        user.setName("Yana");
        user.setBalance(500);

        PhysicalProduct physicalP1 = new PhysicalProduct();
        physicalP1.setId(1);
        physicalP1.setName("earphones");
        physicalP1.setPrice(300);
        physicalP1.setWeight(0.5);

        DigitalProduct digitalP2 = new DigitalProduct();
        digitalP2.setId(2);
        digitalP2.setName("Book");
        digitalP2.setPrice(25.99);
        digitalP2.setFileSize(5.2);

        Order order = new Order(user);
        order.addProduct(physicalP1);
        order.addProduct(digitalP2);

        OrderService service = new OrderService();
        PaymentStrategy payment = new BalancePayment();
        try {
            service.checkout(order, payment);
            System.out.println("Оплата прошла успешно!");
        } catch (Exception e) {
            System.out.println("Something happened! " + e.getMessage());
        }
        System.out.println("Остаток на балансе: " + user.getBalance());
    }
}
