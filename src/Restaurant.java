import java.util.*;
public class Restaurant {
    public int id;
    public String name;
    public String location;
    public String category;
    public List<Food> foodItems;


    public Restaurant(int id, String name, String location, String category) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.category = category;
        this.foodItems = new ArrayList<>();
    }

    public void addMenuItem(String name, int price, String type) {
        foodItems.add(new Food(name, price, type));
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void displayDetails() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Restaurant id: " + id);
        System.out.println("Location: " + location);
        System.out.println("Category: " + category);
    }

    void view_restaurants_menu_items(String area, String categ) {
        if (category.equals(categ) && location.equals(area)) {
            for (int i = 0; i < foodItems.size(); i++) {
                System.out.println((i + 1) + "- " + foodItems.get(i).name + ":" + foodItems.get(i).price + " $");
            }
        }
    }
}


