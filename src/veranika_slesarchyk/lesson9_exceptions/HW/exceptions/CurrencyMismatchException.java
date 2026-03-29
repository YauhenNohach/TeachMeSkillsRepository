package veranika_slesarchyk.lesson9_exceptions.HW.exceptions;

public class CurrencyMismatchException extends RuntimeException {
    public CurrencyMismatchException(String message) {
        super(message);
    }
}
