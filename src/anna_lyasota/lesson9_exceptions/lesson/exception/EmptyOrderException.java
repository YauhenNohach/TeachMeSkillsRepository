package anna_lyasota.lesson9_exceptions.lesson.exception;

public class EmptyOrderException extends RuntimeException{
    public EmptyOrderException(String message) {
        super(message);
    }
    //Если в заказе нет товаров
}
