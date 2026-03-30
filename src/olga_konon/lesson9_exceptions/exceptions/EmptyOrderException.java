package olga_konon.lesson9_exceptions.exceptions;

public class EmptyOrderException extends Exception{
    // Если в заказе нет товаров
    public EmptyOrderException(String message) {
            super(message);

    }
}
