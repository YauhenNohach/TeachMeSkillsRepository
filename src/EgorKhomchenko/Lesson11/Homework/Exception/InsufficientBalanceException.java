package EgorKhomchenko.Lesson11.Homework.Exception;

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(double shortfall) {
        super("Insufficient balance: shortfall = " + shortfall);
    }

}
