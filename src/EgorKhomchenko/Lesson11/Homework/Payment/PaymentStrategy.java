package EgorKhomchenko.Lesson11.Homework.Payment;

import EgorKhomchenko.Lesson11.Homework.Model.User;

public interface PaymentStrategy {
    void pay (User user, double amount);


}
