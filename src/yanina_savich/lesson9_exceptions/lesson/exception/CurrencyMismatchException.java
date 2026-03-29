package yanina_savich.lesson9_exceptions.lesson.exception;

public class CurrencyMismatchException extends RuntimeException {
    public CurrencyMismatchException() {
    }

    public CurrencyMismatchException(String message) {
        super(message);
    }
}
