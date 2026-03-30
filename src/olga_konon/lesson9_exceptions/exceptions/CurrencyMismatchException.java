package olga_konon.lesson9_exceptions.exceptions;

public class CurrencyMismatchException extends Exception {
    //Если валюта заказа не поддерживается
    public CurrencyMismatchException(String message) {
        super(message);
    }
}
