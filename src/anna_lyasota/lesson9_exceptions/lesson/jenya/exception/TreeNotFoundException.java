package anna_lyasota.lesson9_exceptions.lesson.jenya.exception;

public class TreeNotFoundException extends RuntimeException {

    public TreeNotFoundException() {
    }

    public TreeNotFoundException(String message) {
        super(message);
    }
}
