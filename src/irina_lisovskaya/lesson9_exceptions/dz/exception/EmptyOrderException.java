package irina_lisovskaya.lesson9_exceptions.dz.exception;

public class EmptyOrderException extends RuntimeException{
//    Если в заказе нет товаров

    public EmptyOrderException() {
    }

    public EmptyOrderException(String message) {
        super(message);
    }
}
