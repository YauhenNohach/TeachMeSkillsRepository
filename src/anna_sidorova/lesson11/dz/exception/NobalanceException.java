package anna_sidorova.lesson11.dz.exception;

public class NobalanceException extends RuntimeException {
    public NobalanceException(String message) {
        super(message);
    }

    public NobalanceException() {
    }
}
