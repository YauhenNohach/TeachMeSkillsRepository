package yauhen_nohach.lesson8_oop_principles.lesson.exception;

public class CurrencyMismatchException extends Exception{
    public CurrencyMismatchException() {
    }

    public CurrencyMismatchException(String message) {
        super(message);
    }
}
