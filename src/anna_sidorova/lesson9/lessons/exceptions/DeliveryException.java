package anna_sidorova.lesson9.lessons.exceptions;

public class DeliveryException extends RuntimeException {
    public DeliveryException() {
    }

    public DeliveryException(String message) {
        super(message);
    }
}
