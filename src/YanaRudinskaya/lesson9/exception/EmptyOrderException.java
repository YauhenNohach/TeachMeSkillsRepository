package YanaRudinskaya.lesson9.exception;

public class EmptyOrderException extends RuntimeException{
    public EmptyOrderException(String message) {
        super(message);
    }
}
