package anna_lyasota.lesson10_string_processing.lesson10.exception;

public class TreeNotFoundException extends RuntimeException {

    public TreeNotFoundException() {
    }

    public TreeNotFoundException(String message) {
        super(message);
    }
}
