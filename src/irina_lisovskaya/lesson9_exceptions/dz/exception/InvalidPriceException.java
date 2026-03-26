package irina_lisovskaya.lesson9_exceptions.dz.exception;

public class InvalidPriceException extends RuntimeException{
//    Если у товара цена ≤ 0

    public InvalidPriceException() {
    }

    public InvalidPriceException(String message) {
        super(message);
    }
}
