
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Person> users = new ArrayList<>();
        Admin admin1 = new Admin("admin1", "123");
        Admin admin2 = new Admin("admin2", "456");
        DeliveryStaff deliveryStaff1 = new DeliveryStaff("delivery1", "147");
        deliveryStaff1.setLocationStaff("Heliopolis");
        DeliveryStaff deliveryStaff2 = new DeliveryStaff("delivery2", "258");
        deliveryStaff2.setLocationStaff("Stanley");
        DeliveryStaff deliveryStaff3 = new DeliveryStaff("delivery3", "369");
        deliveryStaff3.setLocationStaff("Dokki");
        users.add(admin1);
        users.add(admin2);
        users.add(deliveryStaff1);
        users.add(deliveryStaff2);
        List<Governorate> governorates = new ArrayList<>();
        Cairo cairo = new Cairo();
        Alexandria alexandria = new Alexandria();
        Giza giza = new Giza();
        governorates.add(cairo);
        governorates.add(alexandria);
        governorates.add(giza);
        alexandria.restaurants.add(new Restaurant(0, "Balbaa Village for Grills and Seafood", "Sidi Gaber", "Sea Food"));
        alexandria.restaurants.get(0).addMenuItem("Grilled Sea Bass", 280, "main dish");
        alexandria.restaurants.get(0).addMenuItem("Fried Calamari", 150, "main dish");
        alexandria.restaurants.get(0).addMenuItem("Lemon Mint Juice", 40, "drink");
        alexandria.restaurants.add(new Restaurant(1, "Ibn Hamido", "Sidi Gaber", "Sea Food"));
        alexandria.restaurants.get(1).addMenuItem("Mixed Seafood Platter", 350, "main dish");
        alexandria.restaurants.get(1).addMenuItem("Grilled Lobster", 450, "main dish");
        alexandria.restaurants.get(1).addMenuItem("Basbousa", 50, "dessert");
        alexandria.restaurants.add(new Restaurant(2, "Crepeaway", "Sidi Gaber", "crepe"));
        alexandria.restaurants.get(2).addMenuItem("Nutella Crepe", 50, "main dish");
        alexandria.restaurants.get(2).addMenuItem("Chicken Caesar Crepe", 70, "main dish");
        alexandria.restaurants.get(2).addMenuItem("Iced Mocha", 45, "drink");
        alexandria.restaurants.add(new Restaurant(3, "Tutti Frutti Crepe", "Sidi Gaber", "crepe"));
        alexandria.restaurants.get(3).addMenuItem("Oreo Crepe", 45, "main dish");
        alexandria.restaurants.get(3).addMenuItem("Banana Chocolate Crepe", 50, "main dish");
        alexandria.restaurants.get(3).addMenuItem("Chocolate Fondant", 70, "dessert");
        alexandria.restaurants.add(new Restaurant(4, "Abou Fares El Sory", "Sidi Gaber", "grilled"));
        alexandria.restaurants.get(4).addMenuItem("Mixed Grill", 250, "main dish");
        alexandria.restaurants.get(4).addMenuItem("Shish Tawook", 180, "main dish");
        alexandria.restaurants.get(4).addMenuItem("Pomegranate Juice", 40, "drink");
        alexandria.restaurants.add(new Restaurant(5, "Haty Al Sayed", "Sidi Gaber", "grilled"));
        alexandria.restaurants.get(5).addMenuItem("Grilled Lamb Chops", 260, "main dish");
        alexandria.restaurants.get(5).addMenuItem("Stuffed Pigeon", 200, "main dish");
        alexandria.restaurants.get(5).addMenuItem("Om Ali", 60, "dessert");
        alexandria.restaurants.add(new Restaurant(6, "Zephyrion", "Stanley", "Sea Food"));
        alexandria.restaurants.get(6).addMenuItem("Grilled Shrimp:", 250, "main dish");
        alexandria.restaurants.get(6).addMenuItem("Seafood Rice", 180, "main dish");
        alexandria.restaurants.get(6).addMenuItem("Fresh Mango Juice", 50, "drink");
        alexandria.restaurants.add(new Restaurant(7, "Fish Market", "Stanley", "Sea Food"));
        alexandria.restaurants.get(7).addMenuItem("Grilled Sea Bream", 300, "main dish");
        alexandria.restaurants.get(7).addMenuItem("Lobster Thermidor", 450, "main dish");
        alexandria.restaurants.get(7).addMenuItem("Kunafa with Cream", 90, "dessert");
        alexandria.restaurants.add(new Restaurant(8, "Crepe Supreme", "Stanley", "crepe"));
        alexandria.restaurants.get(8).addMenuItem("Nutella & Banana Crepe", 50, "main dish");
        alexandria.restaurants.get(8).addMenuItem("Chicken Ranch Crepe", 65, "main dish");
        alexandria.restaurants.get(8).addMenuItem("Iced Latte", 45, "drink");
        alexandria.restaurants.add(new Restaurant(9, "City Crepe", "Stanley", "crepe"));
        alexandria.restaurants.get(9).addMenuItem("Nutella Crepe", 40, "main dish");
        alexandria.restaurants.get(9).addMenuItem("Turkey & Cheese Crepe", 65, "main dish");
        alexandria.restaurants.get(9).addMenuItem("Brownie with Ice Cream", 70, "dessert");
        alexandria.restaurants.add(new Restaurant(10, "Kababji Grill", "Stanley", "grilled"));
        alexandria.restaurants.get(10).addMenuItem("Mixed Grill Platter", 260, "main dish");
        alexandria.restaurants.get(10).addMenuItem("Shish Tawook", 180, "main dish");
        alexandria.restaurants.get(10).addMenuItem("Mint Lemonade", 30, "drink");
        alexandria.restaurants.add(new Restaurant(11, "El Dahan", "Stanley", "grilled"));
        alexandria.restaurants.get(11).addMenuItem("Lamb Chops", 270, "main dish");
        alexandria.restaurants.get(11).addMenuItem("Grilled Chicken", 140, "main dish");
        alexandria.restaurants.get(11).addMenuItem("Baklava with Pistachios", 70, "dessert");
        cairo.restaurants.add(new Restaurant(0, "Samakmak", "Heliopolis", "Sea Food"));
        cairo.restaurants.get(0).addMenuItem("Grilled Fish Platter", 250, "main dish");
        cairo.restaurants.get(0).addMenuItem("Fried Calamari", 150, "main dish");
        cairo.restaurants.get(0).addMenuItem("Lemon Mint Juice", 40, "drink");
        cairo.restaurants.add(new Restaurant(1, "Fish Market", "Heliopolis", "Sea Food"));
        cairo.restaurants.get(1).addMenuItem("Seafood Paella", 300, "main dish");
        cairo.restaurants.get(1).addMenuItem("Lobster Thermidor", 450, "main dish");
        cairo.restaurants.get(1).addMenuItem("Kunafa with Cream", 80, "dessert");
        cairo.restaurants.add(new Restaurant(2, "City Crepe", "Heliopolis", "crepe"));
        cairo.restaurants.get(2).addMenuItem("Nutella Crepe", 40, "main dish");
        cairo.restaurants.get(2).addMenuItem("Chicken Mushroom Crepe", 60, "main dish");
        cairo.restaurants.get(2).addMenuItem("Iced Mocha", 50, "drink");
        cairo.restaurants.add(new Restaurant(3, "Crepe Supreme", "Heliopolis", "crepe"));
        cairo.restaurants.get(3).addMenuItem("Banana Chocolate Crepe", 45, "main dish");
        cairo.restaurants.get(3).addMenuItem("Beef Bacon & Cheese Crepe", 65, "main dish");
        cairo.restaurants.get(3).addMenuItem("Chocolate Fondant", 70, "dessert");
        cairo.restaurants.add(new Restaurant(4, "Abou Shakra", "Heliopolis", "grilled"));
        cairo.restaurants.get(4).addMenuItem("Mixed Grill Platter", 220, "main dish");
        cairo.restaurants.get(4).addMenuItem("Grilled Kofta", 150, "main dish");
        cairo.restaurants.get(4).addMenuItem("Iced Tea", 30, "drink");
        cairo.restaurants.add(new Restaurant(5, "El Dahan", "Heliopolis", "grilled"));
        cairo.restaurants.get(5).addMenuItem("Lamb Chops", 250, "main dish");
        cairo.restaurants.get(5).addMenuItem("Grilled Chicken", 140, "main dish");
        cairo.restaurants.get(5).addMenuItem("Baklava", 60, "dessert");
        cairo.restaurants.add(new Restaurant(6, "Asmak Restaurant", "Nasr City", "Sea Food"));
        cairo.restaurants.get(6).addMenuItem("Grilled Sea Bass", 280, "main dish");
        cairo.restaurants.get(6).addMenuItem("Fried Shrimp", 220, "main dish");
        cairo.restaurants.get(6).addMenuItem("Strawberry Lemonade:", 45, "drink");
        cairo.restaurants.add(new Restaurant(7, "Halaket El Samak", "Nasr City", "Sea Food"));
        cairo.restaurants.get(7).addMenuItem("Mixed Seafood Platter", 350, "main dish");
        cairo.restaurants.get(7).addMenuItem("Grilled Sardines", 180, "main dish");
        cairo.restaurants.get(7).addMenuItem("Basbousa", 50, "drink");
        cairo.restaurants.add(new Restaurant(8, "city crepe", "Nasr City", "crepe"));
        cairo.restaurants.get(8).addMenuItem("Nutella Crepe", 40, "main dish");
        cairo.restaurants.get(8).addMenuItem("Chicken Mushroom Crepe", 60, "main dish");
        cairo.restaurants.get(8).addMenuItem("Cappuccino", 40, "drink");
        cairo.restaurants.add(new Restaurant(9, "Crepe Station", "Nasr City", "crepe"));
        cairo.restaurants.get(9).addMenuItem("Nutella & Banana Crepe", 45, "main dish");
        cairo.restaurants.get(9).addMenuItem("Turkey & Cheese Crepe", 65, "main dish");
        cairo.restaurants.get(9).addMenuItem("Waffle Sundae", 70, "dessert");
        cairo.restaurants.add(new Restaurant(10, "Kababgy El Azhar Farahat", "Nasr City", "grilled"));
        cairo.restaurants.get(10).addMenuItem("Grilled Pigeon", 200, "main dish");
        cairo.restaurants.get(10).addMenuItem("Kofta Sandwich", 80, "main dish");
        cairo.restaurants.get(10).addMenuItem("Tamarind Juice", 25, "drink");
        cairo.restaurants.add(new Restaurant(11, "Haty El Ghar", "Nasr City", "grilled"));
        cairo.restaurants.get(11).addMenuItem("Shish Tawook", 150, "main dish");
        cairo.restaurants.get(11).addMenuItem("Grilled Lamb Chops", 260, "main dish");
        cairo.restaurants.get(11).addMenuItem("Rice Pudding", 40, "dessert");
        giza.restaurants.add(new Restaurant(0, "Samakmak", "Dokki", "Sea Food"));
        giza.restaurants.get(0).addMenuItem("Grilled Fish Platter", 250, "main dish");
        giza.restaurants.get(0).addMenuItem("Fried Calamari", 150, "main dish");
        giza.restaurants.get(0).addMenuItem("Lemon Juice", 30, "drink");
        giza.restaurants.add(new Restaurant(1, "Fish Market", "Dokki", "Sea Food"));
        giza.restaurants.get(1).addMenuItem("Seafood Paella", 300, "main dish");
        giza.restaurants.get(1).addMenuItem("Lobster Thermidor", 350, "main dish");
        giza.restaurants.get(1).addMenuItem("Cream Caramel", 70, "dessert");
        giza.restaurants.add(new Restaurant(2, "Crepe House", "Dokki", "crepe"));
        giza.restaurants.get(2).addMenuItem("Chocolate Crepe", 40, "main dish");
        giza.restaurants.get(2).addMenuItem("Chicken Ranch Crepe", 60, "main dish");
        giza.restaurants.get(2).addMenuItem("Hot Chocolate", 50, "drink");
        giza.restaurants.add(new Restaurant(3, "City Crepe", "Dokki", "crepe"));
        giza.restaurants.get(3).addMenuItem("Nutella Crepe", 40, "main dish");
        giza.restaurants.get(3).addMenuItem("Chicken Mushroom Crepe", 60, "main dish");
        giza.restaurants.get(3).addMenuItem("Ice Cream", 60, "dessert");
        giza.restaurants.add(new Restaurant(4, "El Dahan", "Dokki", "grilled"));
        giza.restaurants.get(4).addMenuItem("Lamb Chops", 250, "main dish");
        giza.restaurants.get(4).addMenuItem("Grilled Chicken", 140, "main dish");
        giza.restaurants.get(4).addMenuItem("Mint Tea", 25, "drink");
        giza.restaurants.add(new Restaurant(5, "Abou Shakra", "Dokki", "grilled"));
        giza.restaurants.get(5).addMenuItem("Grilled Kofta", 150, "main dish");
        giza.restaurants.get(5).addMenuItem("Shish Tawook", 160, "main dish");
        giza.restaurants.get(5).addMenuItem("Basbousa with Nuts", 50, "dessert");
        giza.restaurants.add(new Restaurant(6, "Samak Batterjee", "Mohandessin", "Sea Food"));
        giza.restaurants.get(6).addMenuItem("Grilled Sea Bream", 280, "main dish");
        giza.restaurants.get(6).addMenuItem("Fried Calamari Rings", 150, "main dish");
        giza.restaurants.get(6).addMenuItem("Fresh Orange Juice", 40, "drink");
        giza.restaurants.add(new Restaurant(7, "Asmak Al Horreyya", "Mohandessin", "Sea Food"));
        giza.restaurants.get(7).addMenuItem("Mixed Seafood Platter:", 400, "main dish");
        giza.restaurants.get(7).addMenuItem("Grilled Lobster", 450, "main dish");
        giza.restaurants.get(7).addMenuItem("Kunafa with Nuts", 70, "dessert");
        giza.restaurants.add(new Restaurant(8, "Crepe Shack", "Mohandessin", "crepe"));
        giza.restaurants.get(8).addMenuItem("Nutella Crepe", 50, "main dish");
        giza.restaurants.get(8).addMenuItem("Chicken Ranch Crepe", 65, "main dish");
        giza.restaurants.get(8).addMenuItem("Iced Mocha", 45, "drink");
        giza.restaurants.add(new Restaurant(9, "city crepe", "Mohandessin", "crepe"));
        giza.restaurants.get(9).addMenuItem("Nutella & Banana Crepe", 50, "main dish");
        giza.restaurants.get(9).addMenuItem("Chicken Mushroom Crepe", 65, "main dish");
        giza.restaurants.get(9).addMenuItem("Brownie with Ice Cream", 70, "dessert");
        giza.restaurants.add(new Restaurant(10, "El Gahsh Grill", "Mohandessin", "grilled"));
        giza.restaurants.get(10).addMenuItem("Mixed Grill Platter", 250, "main dish");
        giza.restaurants.get(10).addMenuItem("Lamb Chops", 270, "main dish");
        giza.restaurants.get(10).addMenuItem("Iced Tea", 35, "drink");
        giza.restaurants.add(new Restaurant(11, "Haty El Mohandessin", "Mohandessin", "grilled"));
        giza.restaurants.get(11).addMenuItem("Kofta", 140, "main dish");
        giza.restaurants.get(11).addMenuItem("Grilled Veal Chops", 260, "main dish");
        giza.restaurants.get(11).addMenuItem("Om Ali", 60, "dessert");
        List<Order> allorders = new ArrayList<>();
        load(users);

        while (true) {

            System.out.println("\nWelcome to the Food Ordering System");
            System.out.println("1. Login");
            System.out.println("2. Register (Customer Only)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int c1 = input.nextInt();

            if (c1 == 1) {
                System.out.println("\nLogin Menu:");
                System.out.println("1. Customer");
                System.out.println("2. Admin");
                System.out.println("3. Delivery Staff");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine();

                if (choice == 4) {
                    break;
                } else if (choice < 1 || choice > 4) {
                    System.out.println("Invalid choice. Returning to Main Menu.");
                    continue;
                }

                System.out.print("Enter username: ");
                String username = input.nextLine();
                System.out.print("Enter password: ");
                String password = input.nextLine();

                String role = "";
                if (choice == 1) {
                    role = "Customer";
                } else if (choice == 2) {
                    role = "Admin";
                } else if (choice == 3) {
                    role = "DeliveryStaff";
                }
                Person user = Person.Login(username, password, role, users);

                if (user != null) {
                    System.out.println("Login successful!");
                    if (user instanceof Admin) {
                        Admin a = (Admin) user;
                        while (true) {
                            System.out.println("Welcome, Admin! You can now manage the system.");
                            System.out.println("\nAdmin Menu:");
                            System.out.println("1.Add Restaurant");
                            System.out.println("2.Update Restaurant");
                            System.out.println("3.Delete Restaurant");
                            System.out.println("4.Exit");
                            System.out.print("Enter your choice: ");
                            int c4 = input.nextInt();
                            if (c4 == 4) {
                                break;
                            } else {
                                System.out.println("Select a Governorate:");
                                Governorate selected;
                                while (true) {
                                    for (int i = 0; i < governorates.size(); i++) {
                                        System.out.println((i + 1) + ". " + governorates.get(i).getName());
                                    }
                                    int govc = input.nextInt();
                                    if (govc > 0 && govc < governorates.size() + 1) {
                                        selected = governorates.get(govc - 1);
                                        break;
                                    } else {
                                        System.out.println("\nThe governorate cannot be found");
                                        System.out.println("Please enter an existing governorate");
                                    }
                                }

                                int areac;
                                String area;
                                while (true) {
                                    selected.displayAreas();
                                    areac = input.nextInt();
                                    input.nextLine();
                                    if (areac == 1) {
                                        area = selected.area1;
                                        break;
                                    } else if (areac == 2) {
                                        area = selected.area2;
                                        break;
                                    } else {
                                        System.out.println("\nThe area cannot be found");
                                        System.out.println("Please enter an existing area");
                                    }
                                }
                                if (c4 == 1) {
                                    a.Add(selected, area);
                                } else if (c4 == 2) {
                                    a.Update(selected, area);
                                } else if (c4 == 3) {
                                    a.Delete(selected, area);
                                }
                            }
                        }
                    } else if (user instanceof DeliveryStaff) {
                        DeliveryStaff d = (DeliveryStaff) user;
                        d.addOrder(allorders);
                        System.out.println("Welcome, Delivery Staff! You can now manage deliveries.");
                        boolean exit = false;
                        while (!exit) {
                            System.out.println("\nWhat do you want?");
                            System.out.println("1 - Display your assigned orders");
                            System.out.println("2 - Confirm order");
                            System.out.println("3 - View your performance rating");
                            System.out.println("4 - Exit");

                            int c5 = input.nextInt();

                            switch (c5) {
                                case 1:

                                    d.viewAssignedOrders();
                                    break;

                                case 2:
                                    d.confirmedOrders();
                                    break;

                                case 3:
                                    String performance = d.evaluatePerformance();
                                    System.out.println("Your performance rating is: " + performance);
                                    break;

                                case 4:
                                    System.out.println("Goodbye!");
                                    exit = true;
                                    break;

                                default:
                                    System.out.println("Invalid choice. Please try again.");
                            }
                        }

                    } else if (user instanceof Customer) {
                        Customer c = (Customer) user;
                        while (true) {
                            System.out.println("Welcome, Customer! Enjoy browsing.");
                            System.out.println("\nWhat do you want to do? ");
                            System.out.println("1. Create Orders");
                            System.out.println("2. Cancel Orders");
                            System.out.println("3. Update Orders");
                            System.out.println("4. Check order State");
                            System.out.println("5. View all orders");
                            System.out.println("6. Exit");
                            System.out.print("Enter your choice: ");
                            int c2 = input.nextInt();
                            if (c2 == 1) {
                                System.out.println("\nWelcome, Customer! Please select your Governorate:");
                                Governorate selected;
                                while (true) {
                                    for (int i = 0; i < governorates.size(); i++) {
                                        System.out.println((i + 1) + ". " + governorates.get(i).getName());
                                    }
                                    int govc = input.nextInt();
                                    if (govc > 0 && govc < governorates.size() + 1) {
                                        selected = governorates.get(govc - 1);
                                        break;
                                    } else {
                                        System.out.println("\nThe governorate cannot be found");
                                        System.out.println("Please enter an existing governorate");
                                    }
                                }
                                int areac;
                                String area;
                                while (true) {
                                    selected.displayAreas();
                                    areac = input.nextInt();
                                    if (areac == 1) {
                                        area = selected.area1;
                                        break;
                                    } else if (areac == 2) {
                                        area = selected.area2;
                                        break;
                                    } else {
                                        System.out.println("\nThe area cannot be found");
                                        System.out.println("Please enter an existing area");
                                    }
                                }
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
                                c.Create_Order(area, category, selected, allorders);


                            } else if (c2 == 2) {
                                c.View_all_Orders();
                                if (c.orders.isEmpty())
                                    System.out.println("\nNo Orders Found\n");
                                else {
                                    System.out.println("\n Choose the order you want to cancel by id number: ");
                                    int ans = input.nextInt();
                                    if (ans > 0 && ans <= c.orders.getLast().orderId) {
                                        for (int i = 0; i < c.orders.size(); i++) {
                                            if (ans == c.orders.get(i).orderId) {
                                                if ( c.orders.get(i).orderStatus.equals("is delivered")) {
                                                    System.out.println("Your order is deliverd you can not update it");
                                                }else{
                                                   c.Cancel_orders(i);
                                                   for (int j = 0; j < allorders.size(); j++) {
                                                     if (allorders.get(j).orderId == ans)
                                                        allorders.remove(j);
                                                   }
                                                }
                                            }
                                        }
                                    } else {
                                        System.out.println("order id not found");
                                    }
                                }
                            } else if (c2 == 3) {
                                if (c.orders.isEmpty())
                                    System.out.println("\nNo Orders Found\n");
                                else {
                                    System.out.println("What update do you want to do?");
                                    System.out.println("1.Add to order");
                                    System.out.println("2.Remove from order");
                                    System.out.println("3.Exit");
                                    int answer = input.nextInt();
                                    switch (answer)
                                    {
                                        case 1 :
                                            c.View_all_Orders();
                                            System.out.println("Enter the order id :");
                                            int id = input.nextInt();
                                            if (id > 0  && id <= c.orders.getLast().orderId) {
                                                for (int i = 0; i < c.orders.size(); i++) {
                                                    if (id == c.orders.get(i).orderId) {
                                                        if ( c.orders.get(i).orderStatus.equals("is delivered"))
                                                        {System.out.println("Your order is deliverd you can not update it");}
                                                        else
                                                        {c.addItem(i, c.orders.get(i).order, c.orders.get(i).orderPrice);}
                                                    }
                                                }
                                            }else {
                                                System.out.println("order id not found");
                                            }
                                            break;
                                        case 2 :
                                            c.View_all_Orders();
                                            System.out.println("Enter the order id :");
                                            int id2 = input.nextInt();
                                            if (id2 > 0  && id2 <= c.orders.getLast().orderId) {
                                                for (int i = 0; i < c.orders.size(); i++) {
                                                    if (id2 == c.orders.get(i).orderId) {
                                                        if ( c.orders.get(i).orderStatus.equals("is delivered"))
                                                        {System.out.println("Your order is deliverd you can not update it");}
                                                        else
                                                        {c.removeItem(i, c.orders.get(i).order,c.orders.get(i).orderPrice);}
                                                    }
                                                }
                                            }else {
                                                System.out.println("order id not found");
                                            }
                                            break;
                                        case 3 :
                                            System.out.println("do you want to leave ?");
                                            String ans = input.next();
                                            if (ans.equals("y"))
                                                break;
                                        default:
                                            System.out.println("invalid choice");

                                    }
                                }
                            } else if (c2 == 4) {
                                if (c.orders.isEmpty()) {
                                    System.out.println("No orders found");
                                } else {
                                    System.out.println("\nYour orders:");
                                    c.View_all_Orders();
                                    System.out.println("\nEnter the order id :");
                                    int id = input.nextInt();
                                    if (id > 0 && id <= c.orders.getLast().orderId) {
                                        for (int i = 0; i < c.orders.size(); i++) {
                                            if (id == c.orders.get(i).orderId)
                                                c.check_order_state(i);
                                        }
                                    } else {
                                        System.out.println("Order id not found");
                                    }
                                }
                            } else if (c2 == 5) {
                                if (c.orders.isEmpty()) {
                                    System.out.println("No orders found");
                                } else {
                                    c.View_all_Orders();
                                }
                            } else if (c2 == 6) {
                                System.out.println("do you want to leave ?");
                                String ans = input.next();
                                if (ans.equals("y"))
                                    break;
                            } else
                                System.out.println("Invalid credentials. Please try again.");
                        }
                    }
                } else {
                    System.out.println("Login failed!!");
                }

            } else if (c1 == 2) {
                System.out.print("Enter username: ");
                String username = input.next();
                input.nextLine();
                System.out.print("Enter password: ");
                String password = input.next();
                input.nextLine();
                System.out.print("Enter Email: ");
                String Email = input.next();
                input.nextLine();
                System.out.print("Enter PhoneNumber: ");
                String PhoneNumber = input.next();
                input.nextLine();
                System.out.print("Enter Age: ");
                char Age = input.next().charAt(0);
                input.nextLine();
                System.out.print("Enter Gender: ");
                String Gender = input.next();
                input.nextLine();
                System.out.print("Enter Address: ");
                String Address = input.next();

                Customer customer = new Customer(username, password, Email, PhoneNumber, Age, Gender, Address);
                users.add(customer);
            } else if (c1 == 3) {
                System.out.println("Exiting the system. Goodbye!");
                save(users);
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void load(List<Person> users) {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"));){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[2].equals("Customer")) {
                    users.add(new Customer(parts[0], parts[1]));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void save(List<Person> users) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"));){
            for (Person user : users) {
                writer.write(user.username + "," + user.password + "," + user.getRole() + "\n");
            }
            System.out.println("User data saved successfully.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
