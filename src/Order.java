import java.util.*;

public class Order {

    public int orderId;
    public Date orderDate;
    public int orderPrice;
    public String orderLocation;
    public String orderStatus;
    public ArrayList<String> order;
    public Restaurant restaurant;

    public Order(int orderId, Date orderDate, int orderPrice, String orderLocation, String orderStatus, Restaurant restaurant) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderPrice = orderPrice;
        this.orderLocation = orderLocation;
        this.orderStatus = orderStatus;
        this.restaurant = restaurant;
        this.order = new ArrayList<>();
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
