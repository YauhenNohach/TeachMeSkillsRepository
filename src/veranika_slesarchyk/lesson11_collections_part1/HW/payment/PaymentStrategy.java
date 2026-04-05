package veranika_slesarchyk.lesson11_collections_part1.HW.payment;

import veranika_slesarchyk.lesson11_collections_part1.HW.model.User;

public interface PaymentStrategy {
    void pay(User user, double amount);
}
