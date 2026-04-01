package anna_lyasota.lesson9_exceptions.lesson.exception;

public class InvalidPriceException extends RuntimeException {
    public InvalidPriceException(String message) {
        super(message);
    }
    //Если у товара цена ≤ 0
}
