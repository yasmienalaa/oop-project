# Food Ordering Management System

## Overview
The **Food Ordering Management System** is designed to streamline the management of food ordering and delivery activities. It accommodates three categories of users: **Admin**, **Delivery Staff**, and **Customer**. All users inherit common properties and methods from the `Person` class.

## User Classes

### Class: Person
- **Description**: Serves as the base class for all users (Admin, Delivery Staff, Customer).
- **Functionality**: Incorporates shared functionalities such as login (registration and login details are stored in files for data persistence).

### Class: Customer
- **Inherits from**: Person
- **Functionality**:
  - **Create Order**: Choose items and place a new order.
  - **Cancel Order**: Withdraw an existing order.
  - **Update Order**: Alter details of an order.
  - **View Orders**: Access a record of all past and current orders.
  - **Check Order State**: Track the status of an order.

### Class: Admin
- **Inherits from**: Person
- **Functionality**:
  - **Add Restaurant**: Register new restaurants in the system.
  - **Update Restaurant**: Edit restaurant information.
  - **Delete Restaurant**: Remove a restaurant from the system.

### Class: Delivery Staff
- **Inherits from**: Person
- **Functionality**:
  - **Display Orders**: View all orders available for delivery in their designated area.
  - **Confirm Order**: Acknowledge that an order has been delivered.
  - **View Rating**: Check their personal rating based on the number of completed deliveries.

## Geographical Structure

### Abstract Class: Governorate
- **Description**: Represents geographical regions.
- **Subclasses**: Cairo, Alexandria, and Giza.
- **Structure**:
  - **Areas**: Two areas per governed region.
  - **Categories**: Three categories per area (Sea Food, Grilled, Crepe).
  - **Restaurants**: A minimum of two restaurants per category.

## Additional Classes

### Class: Restaurant
- **Description**: Represents the restaurants within the system.
- **Details**: Each restaurant belongs to a specific category and area within a governed region, offering menus with various food items.

### Class: Order
- **Description**: Represents customer orders.
- **Details**: Orders consist of details like the items ordered, total price, and status. Each order is linked to a specific restaurant and location.

### Class: Food
- **Description**: Represents individual food items available on restaurant menus.
- **Attributes**: Food items contain attributes such as name, price, and type.

## Conclusion
This project aims to improve the efficiency of food ordering and delivery processes, providing a user-friendly interface for all participants in the system.
