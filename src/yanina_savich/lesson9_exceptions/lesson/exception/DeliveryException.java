package yanina_savich.lesson9_exceptions.lesson.exception;

public class DeliveryException extends RuntimeException{
    public DeliveryException() {
    }
    public DeliveryException(String message) {
        super(message);
    }
}
