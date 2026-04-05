package anna_sidorova.lesson10.dz.exception;

public class TreeNotFoundException extends RuntimeException {
    public TreeNotFoundException(String message) {
        super(message);
    }

    public TreeNotFoundException() {
    }
}
