package viktoriya_satsiuk.lesson_9_exceptions.Homework.Model;

import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.CurrencyMismatchException;

public class PickupOrder extends Order{
    public PickupOrder(Store store, Product[] products, CurrencyType currencyType)
            throws CurrencyMismatchException {
        super(store, products, currencyType);
    }
}
