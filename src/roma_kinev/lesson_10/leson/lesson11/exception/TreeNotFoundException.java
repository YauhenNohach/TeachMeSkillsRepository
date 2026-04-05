package roma_kinev.lesson_10.leson.lesson11.exception;

public class TreeNotFoundException extends RuntimeException {

    public TreeNotFoundException() {
    }

    public TreeNotFoundException(String message) {
        super(message);
    }
}
