package yanina_savich.lesson9_exceptions.lesson.exception;

public class EmptyOrderException extends RuntimeException{
    public EmptyOrderException(String message) {
        super(message);
    }

    public EmptyOrderException() {
    }
}
