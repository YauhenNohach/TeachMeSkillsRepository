package irina_lisovskaya.lesson9_exceptions.dz.model;

import irina_lisovskaya.lesson9_exceptions.dz.exception.DeliveryException;

public class OnlineOrder extends Order {
   private String deliveryAddress;

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void finalizeOrder() {
        if (deliveryAddress == null || deliveryAddress.isEmpty()) {
            throw new DeliveryException("Адрес доставки не указан.");
        }
        setTotalPrice(getTotalPrice() + 5.0);
        System.out.printf("Добавлена стоимость доставки: 5.0 %s по адресу: %s%n",
                getCurrencyType(), deliveryAddress);
    }
}
