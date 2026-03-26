package irina_lisovskaya.lesson9_exceptions.dz.exception;

public class CurrencyMismatchException extends RuntimeException{
//    Если валюта заказа не поддерживается


    public CurrencyMismatchException() {
    }

    public CurrencyMismatchException(String message) {
        super(message);
    }
}
