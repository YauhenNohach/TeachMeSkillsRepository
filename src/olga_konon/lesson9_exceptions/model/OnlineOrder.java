package olga_konon.lesson9_exceptions.model;

public class OnlineOrder extends Order {

    private String deliveryAddress;

    public OnlineOrder(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public OnlineOrder() {
        super();
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


}
