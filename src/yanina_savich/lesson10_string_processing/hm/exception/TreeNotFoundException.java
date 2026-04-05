package yanina_savich.lesson10_string_processing.hm.exception;

public class TreeNotFoundException extends RuntimeException {

    public TreeNotFoundException() {
    }

    public TreeNotFoundException(String message) {
        super(message);
    }
}
