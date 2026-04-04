package veronika_akulovich.lesson9_exceptions.exception;

public class InvalidPriceException extends RuntimeException{
    //Если у товара цена ≤ 0

    public InvalidPriceException() {
    }

    public InvalidPriceException(String message) {
        super(message);
    }
}
