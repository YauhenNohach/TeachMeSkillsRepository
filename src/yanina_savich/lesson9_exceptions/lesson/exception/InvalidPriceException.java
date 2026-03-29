package yanina_savich.lesson9_exceptions.lesson.exception;

public class InvalidPriceException extends RuntimeException{
    public InvalidPriceException() {
    }

    public InvalidPriceException(String message) {
        super(message);
    }
}
