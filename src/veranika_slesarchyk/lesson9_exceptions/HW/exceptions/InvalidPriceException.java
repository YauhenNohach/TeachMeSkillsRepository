package veranika_slesarchyk.lesson9_exceptions.HW.exceptions;

public class InvalidPriceException extends RuntimeException {
    public InvalidPriceException(String message) {
        super(message);
    }
}
