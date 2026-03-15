import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Customer extends Person {
    public String Email;
    public String PhoneNumber;
    public char Age;
    public String Gender;
    public String Address;
    public ArrayList<Order> orders = new ArrayList<>();

    public Customer(String username, String password) {
        super(username, password);
    }

    public Customer(String username, String password, String Email, String PhoneNumber, char Age, String Gender, String Address) {
        super(username, password);
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Age = Age;
        this.Gender = Gender;
        this.Address = Address;
    }

    @Override
    protected String getRole() {
        return "Customer";
    }

    public void check_order_state(int index) {
        System.out.println("Your order now " + orders.get(index).orderStatus);
    }

    public int return_price(int menuitem, Restaurant restaurant, int j) {
        for (int i = 0; i < restaurant.foodItems.size(); i++) {
            if (menuitem == i + 1) {
                orders.get(j).order.add(restaurant.foodItems.get(i).name);
                return restaurant.foodItems.get(i).price;
            }
        }
        return 0;

    }

    public void ViewOrder(int i, int price) {
        System.out.println(orders.get(i).order);
        System.out.println("Total Price : " + price + " $");
    }

    public void View_all_Orders() {
        for (int i = 0; i < orders.size(); i++) {
            System.out.println("\nOrder id : " + orders.get(i).orderId);
            System.out.println("Order location : " + orders.get(i).orderLocation);
            System.out.println("Order price : " + orders.get(i).orderPrice + " $");
            System.out.println("Order date : " + orders.get(i).orderDate);
            System.out.println("Order : " + orders.get(i).order + "\n");
            System.out.println(" \t\t\t ______________________________");
        }
    }

    public void Cancel_orders(int ID) {
        orders.remove(ID);
    }

    int id=0;
    public void Create_Order(String area, String category, Governorate selected, List<Order> allorders) {
        Scanner input = new Scanner(System.in);
        int price = 0;

        System.out.println("Choose Restaurant (by restaurant id):");
        selected.displayRestaurants(area, category, selected.restaurants);
        int id_R = input.nextInt();

        int restIndex = -1;
        for (int k = 0; k < selected.restaurants.size(); k++) {
            if (id_R == selected.restaurants.get(k).id &&
                    selected.restaurants.get(k).category.equals(category) &&
                    selected.restaurants.get(k).location.equals(area)) {
                restIndex = k;
                id++;
                break;
            }
        }

        if (restIndex == -1) {
            System.out.println("Restaurant id not found.");
            return;
        }

        Restaurant selectedRestaurant = selected.restaurants.get(restIndex);
        Order order = new Order(id,new Date(), price, area, "not confirmed", selectedRestaurant);
        orders.add(order);
        allorders.add(order);

        while (true) {
            System.out.println("Choose what you want:");
            selectedRestaurant.view_restaurants_menu_items(area, category);
            int menuItem = input.nextInt();

            if (menuItem <= 0 || menuItem > selectedRestaurant.foodItems.size()) {
                System.out.println("Invalid menu item. Please try again.");
                continue;
            }

            System.out.println("Enter Quantity: ");
            int count = input.nextInt();

            for (int i = 0; i < count; i++) {
                price += return_price(menuItem, selectedRestaurant, orders.size() - 1);
            }
            order.orderPrice = price;

            System.out.println("Do you want to choose another item? (y/n)");
            String ans = input.next();
            if (ans.equalsIgnoreCase("n")) {
                System.out.println("You have successfully completed your order.");
                ViewOrder(orders.size() - 1, price);
                break;
            }
        }
    }

    public int[] ItemToAdd() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose what do you want to add and the quantity");
        int add = input.nextInt();
        int quantity = input.nextInt();
        return new int[]{add, quantity};
    }

    public int[] ItemToRemove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose what do you want to remove and the quantity");
        int rem = input.nextInt();
        int quantity = input.nextInt();
        return new int[]{rem, quantity};
    }

    public void addItem(int index, ArrayList<String> order, int price) {
        for (int i = 0; i < orders.get(index).restaurant.foodItems.size(); i++) {
            System.out.println((i + 1) + "- " + orders.get(index).restaurant.foodItems.get(i).name + ":"
                    + orders.get(index).restaurant.foodItems.get(i).price + " $");
        }
        int[] input = ItemToAdd();
        int a = input[0] - 1;
        int quantity = input[1];

        if (a >= 0 && a < orders.get(index).restaurant.foodItems.size()) {
            String itemName = orders.get(index).restaurant.foodItems.get(a).name;
            for (int i = 0; i < quantity; i++) {
                order.add(itemName);
                for (int k = 0; k < orders.get(index).restaurant.foodItems.size(); k++) {
                    if (itemName.equals(orders.get(index).restaurant.foodItems.get(k).name)) {
                        price += orders.get(index).restaurant.foodItems.get(k).price;
                    }
                }
            }
            orders.get(index).orderPrice = price;
            System.out.println("Your order has been updated:");
            ViewOrder(index, orders.get(index).orderPrice);
        } else {
            System.out.println("Invalid item number.");
        }
    }

    public void removeItem(int index, ArrayList<String> order, int price) {
        ViewOrder(index, price);
        int[] input = ItemToRemove();
        int r = input[0] - 1;
        int quantity = input[1];
        if (r >= 0 && r < order.size()) {
            int p = 0;
            String itemName = order.get(r);
            for (int j = 0; j < quantity; j++) {
                order.remove(itemName);
                for (int k = 0; k < orders.get(index).restaurant.foodItems.size(); k++) {
                    if (itemName.equals(orders.get(index).restaurant.foodItems.get(k).name)) {
                        price -= orders.get(index).restaurant.foodItems.get(k).price;
                        p = index;
                    }
                }
            }
            orders.get(p).orderPrice = price;
            System.out.println("Your order has been updated:");
            ViewOrder(p, orders.get(p).orderPrice);
        } else {
            System.out.println("Invalid item number.");
        }

    }
}