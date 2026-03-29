package veranika_slesarchyk.lesson9_exceptions.HW.exceptions;

public class EmptyOrderException extends RuntimeException {
    public EmptyOrderException(String message) {
        super(message);
    }
}
