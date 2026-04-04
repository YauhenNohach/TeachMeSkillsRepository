package viktoriya_satsiuk.lesson11_collections.homework.payment;

import viktoriya_satsiuk.lesson11_collections.homework.model.User;

public interface PaymentStrategy {
    void pay(User user, double amount);
}
