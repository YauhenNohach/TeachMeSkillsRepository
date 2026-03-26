package irina_lisovskaya.lesson9_exceptions.dz.exception;

public class DeliveryException extends RuntimeException {
//    Если у OnlineOrder не указан адрес

    public DeliveryException() {
    }

    public DeliveryException(String message) {
        super(message);
    }
}

