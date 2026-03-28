package Pasha.lesson9.lesson;

public class EmptyOrderException extends Exception {
    protected EmptyOrderException(String message) {
        super(message);
    }
}