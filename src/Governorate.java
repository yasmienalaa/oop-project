import java.util.ArrayList;
import java.util.List;
public abstract class Governorate {
    protected String area1;
    protected String area2;
    protected List<Restaurant> restaurants;

    public Governorate(String area1, String area2) {
        this.area1 = area1;
        this.area2 = area2;
        this.restaurants = new ArrayList<>();
    }

    public void addRestaurant1(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void displayRestaurants(String area, String category, List<Restaurant> restaurants) {
        System.out.println("Restaurants in " + area + ":");

        int j = 0;
        for (int i = 0; i < restaurants.size(); i++) {
            if (restaurants.get(i).category.equals(category) && restaurants.get(i).location.equals(area)) {
                System.out.print(++j + "- ");
                restaurants.get(i).displayDetails();
                System.out.println("--------------------");
            }
        }
    }

    public abstract void displayAreas();

    public abstract String getName();
}