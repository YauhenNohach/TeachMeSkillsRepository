package EgorKhomchenko.Lesson10.Homework;

public class TreeNotFoundExceptions extends RuntimeException {
    public void TreeNotFoundException() { }
    public TreeNotFoundExceptions(String message) {

        super(message);
    }
}
