import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeliveryStaff extends Person {

    private double review;
    private int completedOrders;
    private String locationStaff;
    private List<Order> orders;

    public DeliveryStaff(String userName, String password) {
        super(userName, password);
        this.orders = new ArrayList<>();
    }

    @Override
    protected String getRole() {
        return "DeliveryStaff";
    }

    public String evaluatePerformance() {
        review = (completedOrders * 10);
        if (review >= 40) {
            return "Excellent";
        } else if (review >= 30) {
            return "Good";
        } else if (review >= 20) {
            return "Needs Improvement";
        } else {
            return "Poor";
        }
    }

    public void setLocationStaff(String locationStaff) {
        this.locationStaff = locationStaff;
    }

    public void addOrder(List<Order> allorders) {
        for (Order o : allorders) {
            if (o.getOrderLocation().equals(this.locationStaff)) {
                orders.add(o);
            }
        }
    }

    public void viewAssignedOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders assigned to you " + username + ".");
        } else {
            System.out.println("Here are your orders " + username + ":");
            for (int i = 0; i < orders.size(); i++) {
                System.out.println("Order ID: " + orders.get(i).orderId
                        + "\nOrder Price: " + orders.get(i).orderPrice
                        + "\nOrder Restaurant: " + orders.get(i).restaurant.name);
            }
        }
    }

    public void confirmedOrders() {
        System.out.println("Enter the ID of the order:");
        Scanner scanner = new Scanner(System.in);
        int orderid = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.orderId == orderid) {
                completedOrders++;
                orders.remove(i);
                System.out.println("Order " + orderid + " is confirmed.");
                order.setOrderStatus("is delivered");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Order with ID: " + orderid + " not found.");
        }
    }
}
