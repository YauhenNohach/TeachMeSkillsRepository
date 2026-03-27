package veronika_akulovich.lesson9_exceptions.exception;

public class DeliveryException extends RuntimeException{
    // Если у OnlineOrder не указан адрес

    public DeliveryException() {
    }

    public DeliveryException(String message) {
        super(message);
    }
}
