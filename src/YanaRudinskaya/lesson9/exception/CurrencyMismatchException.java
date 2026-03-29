package YanaRudinskaya.lesson9.exception;

public class CurrencyMismatchException extends RuntimeException{
    public CurrencyMismatchException(String message) {
        super(message);
    }
}
