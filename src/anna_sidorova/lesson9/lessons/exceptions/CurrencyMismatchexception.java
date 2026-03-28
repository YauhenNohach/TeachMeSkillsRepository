package anna_sidorova.lesson9.lessons.exceptions;

public class CurrencyMismatchexception extends RuntimeException {

    public CurrencyMismatchexception() {
    }

    public CurrencyMismatchexception(String message) {
        super(message);
    }
}
