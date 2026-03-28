package yauhen_nohach.lesson9_exceptions.lesson;

public class CarNotFoundEcxeption extends RuntimeException {
    public CarNotFoundEcxeption() {
    }

    public CarNotFoundEcxeption(String message) {
        super(message);
    }
}
