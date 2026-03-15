# oop-project
Food Ordering Management System
The Food Ordering Management System is designed to 
facilitate the seamless management of food ordering and 
delivery operations. It includes three types of users: 
Admin, Delivery Staff, and Customer. All users inherit 
common properties and methods from the Person class. 
1. Class: Person 
o Base class for all users (Admin, Delivery Staff, 
Customer). 
o Includes common functionalities such as login 
(All registration and login are stored in files for 
persistence.) 
2. Class: Customer 
o Inherits from Person. 
o Implements functionalities specific to 
customers, such as(Create Order: Select items 
and create a new order, Cancel Order: Cancel an 
existing order, Update Order: Modify details of an 
order, View Orders: Access a list of all their past 
and current orders, Check Order State: Monitor 
the status of an order). 
3. Class: Admin 
o Inherits from Person. 
o Manages restaurant data (Add Restaurant: The 
admin can register new restaurants into the 
system, Update Restaurant: The admin can 
modify restaurant details, Delete Restaurant: The 
admin can remove a restaurant from the system). 
4. Class: Delivery Staff 
o Inherits from Person. 
o Manages order delivery and reviews(Display 
Orders: View all available orders in his assigned 
area for delivery, Confirm Order: Confirm that an 
order has been delivered, View Rating: Check 
their personal rating based on the number of 
orders delivered). 
5. Abstract Class: Governorate 
o Represents geographical regions. 
o Subclasses include Cairo, Alexandria, and Giza. 
o Each region contains: 
▪ Areas: Two areas per governed rate. 
▪ Categories: Three categories per area (Sea 
Food, Grilled, Crepe). 
▪ Restaurants: At least two restaurants per 
category. 
6. Class: Restaurant 
o Represents the restaurants in the system. 
o Each restaurant belongs to a specific category 
and area within a governed rate. 
o Restaurants provide menus containing various 
food items. 
7. Class: Order 
o Represents customer orders. 
o Orders include details such as the items 
ordered, total price, and status. 
o Each order is associated with a specific 
restaurant and location. 
8. Class: Food 
o Represents individual food items available in 
restaurant menus. 
o Food items have attributes like name, price, and 
type. 
