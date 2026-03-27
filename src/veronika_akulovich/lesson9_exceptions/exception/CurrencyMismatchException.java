package veronika_akulovich.lesson9_exceptions.exception;

public class CurrencyMismatchException extends RuntimeException{
    // Если валюта заказа не поддерживается
    public CurrencyMismatchException() {
    }

    public CurrencyMismatchException(String message) {
        super(message);
    }
}
