package yanina_savich.lesson11_collections_part1.hm.service;

import yanina_savich.lesson11_collections_part1.hm.exeption.EmptyOrderException;
import yanina_savich.lesson11_collections_part1.hm.exeption.InsufficientFundsException;
import yanina_savich.lesson11_collections_part1.hm.model.order.Order;
import yanina_savich.lesson11_collections_part1.hm.payment.PaymentStrategy;

public class OrderService {
    public void checkout(Order order, PaymentStrategy payment) throws InsufficientFundsException, EmptyOrderException {
        if (order.getProducts().isEmpty()){
            throw new EmptyOrderException("Заказ пуст!");
        }
            double total = order.getTotalPrice();
            payment.pay(order.getUser(), total);
        }
    }
