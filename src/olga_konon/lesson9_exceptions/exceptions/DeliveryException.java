package olga_konon.lesson9_exceptions.exceptions;

public class DeliveryException extends Exception {
    // Если у OnlineOrder не указан адрес
    public DeliveryException(String message) {
        super(message);
    }
}
