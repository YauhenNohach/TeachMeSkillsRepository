package anna_lyasota.lesson9_exceptions.lesson.exception;

public class CurrencyMismatchException extends RuntimeException {
    public CurrencyMismatchException(String message) {
        super(message);
    }
    //Если валюта заказа не поддерживается
}
