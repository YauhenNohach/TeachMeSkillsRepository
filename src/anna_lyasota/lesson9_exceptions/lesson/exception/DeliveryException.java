package anna_lyasota.lesson9_exceptions.lesson.exception;

public class DeliveryException extends RuntimeException {
    public DeliveryException(String message) {
        super(message);
    }
//Если у OnlineOrder не указан адрес
}
