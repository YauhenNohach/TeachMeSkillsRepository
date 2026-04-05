package yanina_savich.lesson11_collections_part1.hm.exeption;

public class EmptyOrderException extends RuntimeException {
  public EmptyOrderException(String message) {
    super(message);
  }
}
