# oop-project
Food Ordering Management System
OOP Project
Food Ordering Management System
The Food Ordering Management System is crafted to streamline the management of food ordering and delivery activities. It accommodates three categories of users: Admin, Delivery Staff, and Customer. All users derive common properties and methods from the Person class.

Class: Person

Serves as the base class for all users (Admin, Delivery Staff, Customer).
Incorporates shared functionalities such as login (registration and login details are stored in files for data persistence).
Class: Customer

Inherits from Person.
Implements customer-specific functionalities, including:
Create Order: Choose items and place a new order.
Cancel Order: Withdraw an existing order.
Update Order: Alter details of an order.
View Orders: Access a record of all past and current orders.
Check Order State: Track the status of an order.
Class: Admin

Inherits from Person.
Oversees restaurant data management, including:
Add Restaurant: Register new restaurants in the system.
Update Restaurant: Edit restaurant information.
Delete Restaurant: Remove a restaurant from the system.
Class: Delivery Staff

Inherits from Person.
Handles order delivery and reviews, including:
Display Orders: View all orders available for delivery in their designated area.
Confirm Order: Acknowledge that an order has been delivered.
View Rating: Check their personal rating based on the number of completed deliveries.
Abstract Class: Governorate

Represents geographical regions.
Subclasses comprise Cairo, Alexandria, and Giza.
Each region contains:
Areas: Two areas per governed region.
Categories: Three categories per area (Sea Food, Grilled, Crepe).
Restaurants: A minimum of two restaurants per category.
Class: Restaurant

Represents the restaurants within the system.
Each restaurant belongs to a specific category and area within a governed region.
Restaurants offer menus with various food items.
Class: Order

Represents customer orders.
Orders consist of details like the items ordered, total price, and status.
Each order is linked to a specific restaurant and location.
Class: Food

Represents individual food items available on restaurant menus.
Food items contain attributes such as name, price, and type.
