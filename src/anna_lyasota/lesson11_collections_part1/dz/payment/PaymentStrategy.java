package anna_lyasota.lesson11_collections_part1.dz.payment;

import anna_lyasota.lesson11_collections_part1.dz.service.User;

public interface PaymentStrategy {

    public void pay (User user, double amount);
}
