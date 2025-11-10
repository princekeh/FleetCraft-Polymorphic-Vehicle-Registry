# Vehicle Rental Agency Application


🚛 About the Project

FleetCraft is a clean, interface-driven project focused on demonstrating polymorphism and the core concepts of multiple inheritance through interfaces in Java. We model three distinct types of vehicles a Car, a Motorcycle, and a Truck each with unique properties and behaviors, all while ensuring they adhere to a common Vehicle interface. It’s a textbook example of good OOP design for classifying diverse objects.


🔑 Architectural Highlights

 * Core Vehicle Interface: Defines the common attributes (make, model, year) that all vehicles must implement.
 * Specific Interfaces: Interfaces like CarVehicle, MotorVehicle, and TruckVehicle introduce distinct, specific properties (e.g., doors for a car, cargo capacity for a truck).
 * Composition over Concrete Inheritance: Classes like Car and Truck implement multiple interfaces, allowing them to participate in different type hierarchies simultaneously.
 * Clear Separation of Concerns: The main application logic (Main.java) handles input and output, while the classes manage their own data, respecting the boundaries defined by the interfaces.


💻 Setup & Running

The system is built entirely in Java, structured around a package (CarRentalSystem) to keep things tidy.


🚨 Prerequisites: 
Standard Java Development Kit (JDK).


🎯 The Polymorphism Demo: 
The real takeaway here is the effective use of interfaces. By using interfaces, we can treat a Car (which is also a CarVehicle) and a Truck (which is also a TruckVehicle) simply as a Vehicle when necessary, or drill down into their specific traits when needed. This pattern is essential for writing flexible and extensible Java code.
