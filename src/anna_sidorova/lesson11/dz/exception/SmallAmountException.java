package anna_sidorova.lesson11.dz.exception;

public class SmallAmountException extends RuntimeException {
    public SmallAmountException() {
    }

    public SmallAmountException(String message) {
        super(message);
    }
}
