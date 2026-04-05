package yanina_savich.lesson11_collections_part1.editedFromLesson.exception;

public class TreeNotFoundException extends RuntimeException {

    public TreeNotFoundException() {
    }

    public TreeNotFoundException(String message) {
        super(message);
    }
}
