package yanina_savich.lesson9_exceptions.lesson;

import yanina_savich.lesson9_exceptions.lesson.exception.DeliveryException;

public class OnlineOrder extends Order{
    private String deliveryAddress;

    public OnlineOrder(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public OnlineOrder(Product[] products, Store store, CurrencyType currencyType, String deliveryAddress) {
        super(products, store, currencyType);
        this.deliveryAddress = deliveryAddress;
    }

    public void checkDeliveryAddress(){
        if (deliveryAddress == null){
            throw new DeliveryException("Адрес доставки не указан!");
        }
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    @Override
    public void processOrder(){
       if (deliveryAddress == null || deliveryAddress.isEmpty()){
           throw new DeliveryException("Не указан адресс!");
       }
       setTotalPrice(getTotalPrice() + 5);
    }
}
