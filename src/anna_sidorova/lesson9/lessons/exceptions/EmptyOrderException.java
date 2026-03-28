package anna_sidorova.lesson9.lessons.exceptions;

public class EmptyOrderException extends RuntimeException {
    public EmptyOrderException() {
    }

    public EmptyOrderException(String message) {
        super(message);
    }
}
