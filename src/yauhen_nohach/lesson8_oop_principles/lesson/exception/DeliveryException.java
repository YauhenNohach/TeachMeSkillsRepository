package yauhen_nohach.lesson8_oop_principles.lesson.exception;

public class DeliveryException extends RuntimeException{
    public DeliveryException() {
    }

    public DeliveryException(String message) {
        super(message);
    }
}
