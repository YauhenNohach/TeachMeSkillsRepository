package veronika_akulovich.lesson9_exceptions.exception;

public class EmptyOrderException extends RuntimeException{
    //Если в заказе нет товаров
    public EmptyOrderException() {
    }

    public EmptyOrderException(String message) {
        super(message);
    }
}
