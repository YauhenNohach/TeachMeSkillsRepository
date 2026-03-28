package anna_sidorova.lesson9.lessons.exceptions;

public class InvalidPriceException extends RuntimeException {

    public InvalidPriceException() {
    }

    public InvalidPriceException(String message) {
        super(message);
    }
}
