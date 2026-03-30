package olga_konon.lesson9_exceptions.exceptions;

public class InvalidPriceException extends Exception{
    //Если у товара цена ≤ 0
    public InvalidPriceException(String message) {
        super(message);
    }
}
