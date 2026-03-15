import java.util.*;

public class Admin extends Person {


    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    protected String getRole() {
        return "Admin";
    }

    public void Add(Governorate selected, String area) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Restaurant name: \n");
        String name = input.nextLine();

        System.out.println("Enter Restaurant category: ");
        int categoryc;
        String category;
        while (true) {
            System.out.println("1. Sea Food");
            System.out.println("2. Crepe");
            System.out.println("3. Grilled");
            categoryc = input.nextInt();
            if (categoryc == 1) {
                category = "Sea Food";
                break;
            } else if (categoryc == 2) {
                category = "Crepe";
                break;
            } else if (categoryc == 3) {
                category = "Grilled";
                break;
            } else {
                System.out.println("Invalid category. Please choose a valid category.");
            }
        }

        Restaurant restaurant = new Restaurant(selected.restaurants.size(), name, area, category);

        while (true) {
            System.out.println("Enter Restaurant Menu Items:");
            System.out.print("Name: ");
            String menuItemName = input.next();
            input.nextLine();

            System.out.print("Price: ");
            int price = input.nextInt();
            input.nextLine();

            System.out.print("Type: ");
            String type = input.nextLine();

            restaurant.addMenuItem(menuItemName, price, type);

            System.out.print("Do you want to add another item (y/n)? ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }

        selected.addRestaurant1(restaurant);
        System.out.println("Restaurant added successfully!");
    }

    public void Update(Governorate selected, String area) {
        Scanner input = new Scanner(System.in);

        while (true) {
            Restaurant update = null;
            System.out.println("Choose the category:");
            int categoryc;
            String category;
            while (true) {
                System.out.println("1. Sea Food");
                System.out.println("2. crepe");
                System.out.println("3. grilled");
                categoryc = input.nextInt();
                if (categoryc == 1) {
                    category = "Sea Food";
                    break;
                } else if (categoryc == 2) {
                    category = "crepe";
                    break;
                } else if (categoryc == 3) {
                    category = "grilled";
                    break;
                } else {
                    System.out.println("invalid category");
                    System.out.println("Please choose a valid category");
                }
            }

            System.out.println("Select Restaurant ID to update:");
            selected.displayRestaurants(area,category,selected.restaurants);

            int resc = input.nextInt();
            boolean found = false;
            for (int i = 0; i < selected.restaurants.size(); i++) {
                if (selected.restaurants.get(i).id == resc) {
                    update = selected.restaurants.get(i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Invalid ID. Please try again.");
                continue;
            }

            while (true) {
                System.out.println("What do you want to update?");
                System.out.println("1. Name");
                System.out.println("2. Location");
                System.out.println("3. Category");
                System.out.println("4. Menu Items");
                System.out.print("Enter your choice: ");
                int c = input.nextInt();
                input.nextLine();

                switch (c) {
                    case 1:
                        System.out.print("Enter new Restaurant name: ");
                        String name = input.nextLine();
                        update.name = name;
                        break;

                    case 2:
                        System.out.print("Enter new Restaurant location: ");
                        String location;
                        while (true) {
                            selected.displayAreas();
                            int areac = input.nextInt();
                            if (areac == 1) {
                                location = selected.area1;
                                break;
                            } else if (areac == 2) {
                                location = selected.area2;
                                break;
                            } else {
                                System.out.println("\nThe area cannot be found. Please enter an existing area.");
                            }
                        }
                        update.location = location;
                        break;

                    case 3:
                        System.out.println("Enter new Restaurant category:");
                        int catc;
                        String cat;
                        while (true) {
                            System.out.println("1. Sea Food");
                            System.out.println("2. Crepe");
                            System.out.println("3. Grilled");
                            catc = input.nextInt();
                            if (catc == 1) {
                                cat = "Sea Food";
                                break;
                            } else if (catc == 2) {
                                cat = "Crepe";
                                break;
                            } else if (catc == 3) {
                                cat = "Grilled";
                                break;
                            } else {
                                System.out.println("Invalid category. Please choose a valid category.");
                            }
                        }
                        update.category = cat;
                        break;

                    case 4:
                        while (true) {
                            System.out.println("1.Add new Menu Item");
                            System.out.println("2.Update Menu Item");
                            System.out.println("3. Exit");
                            int c6=input.nextInt();
                            if (c6==1) {
                                System.out.println("Enter new Menu Items (name, price, type):");
                                System.out.print("Name: ");
                                String menuItemName = input.next();
                                input.nextLine();

                                System.out.print("Price: ");
                                int price = input.nextInt();
                                input.nextLine();

                                System.out.print("Type: ");
                                String type = input.nextLine();

                                update.addMenuItem(menuItemName, price, type);
                            } else if (c6==2) {
                                System.out.println("choose menu item:");
                                update.view_restaurants_menu_items(area,category);
                                int i=input.nextInt();
                                System.out.println("what do you want to update?:");
                                System.out.println("1.Name");
                                System.out.println("2.Price");
                                System.out.println("3.Type");
                                int up=input.nextInt();
                                switch (up){
                                    case 1:
                                        System.out.print("Name: ");
                                        String newn = input.nextLine();
                                        update.foodItems.get(i-1).name=newn;
                                        break;
                                    case 2:
                                        System.out.print("Price: ");
                                        int newp = input.nextInt();
                                        input.nextLine();
                                        update.foodItems.get(i-1).price=newp;
                                        break;
                                    case 3:
                                        System.out.print("Type: ");
                                        String newt = input.nextLine();
                                        update.foodItems.get(i-1).type=newt;
                                        break;
                                    default:
                                        System.out.println("invalid choise");
                                }
                            }else {
                                break;
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
                System.out.println("Do you want to update anything else? (y/n)");
                String ans = input.next();
                input.nextLine();
                if (ans.equalsIgnoreCase("n")) {
                    break;
                }
            }

            System.out.println("Restaurant updated successfully!");
            break;
        }
    }

    public void Delete(Governorate selected, String area) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Select a Restaurant to delete by id:");

            for (Restaurant r : selected.restaurants) {
                if (r.getLocation().equals(area)) {
                    System.out.println((r.id) + " " + r.getName());
                }
            }

            int ch = input.nextInt();
            Restaurant delete = null;
            for (Restaurant r : selected.restaurants) {
                if (r.id == ch) {
                    delete = r;
                    break;
                }
            }

            if (delete != null) {
                selected.restaurants.remove(delete);
                System.out.println("Restaurant deleted successfully!");
                break;
            } else {
                System.out.println("Invalid ID. Please try again.");
            }
        }
    }

}
