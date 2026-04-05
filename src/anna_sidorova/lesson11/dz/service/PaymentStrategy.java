package anna_sidorova.lesson11.dz.service;

import anna_sidorova.lesson11.dz.model.user.User;

public interface PaymentStrategy {

    void pay(User user, double amount);
}
