package viktoriya_satsiuk.lesson_9_exceptions.Homework.Model;

import viktoriya_satsiuk.lesson_9_exceptions.Homework.Exception.CurrencyMismatchException;

public class OnlineOrder extends Order{
    private final String deliveryAddress;

    public OnlineOrder(Store store, Product[] products, CurrencyType currencyType, String deliveryAddress)
            throws CurrencyMismatchException {
        super(store, products, currencyType);
        this.deliveryAddress = deliveryAddress;
    }

        public String getDeliveryAddress() {
            return deliveryAddress;
        }
    }
