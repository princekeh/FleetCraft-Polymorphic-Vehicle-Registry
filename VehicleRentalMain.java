// CarRentalSystem (Project Name) 
// VehicleRentalMain.java (Class name) 



package CarRentalSystem; 

import java.util.Scanner;

// Interface representing a generic Vehicle (Doe, 2018)
interface Vehicle {
    String getMake(); // get vehicle brand
    String getModel(); // get vehicle model
    int getYear(); // get manufacturing year
}

// Interface for Car-specific behavior (Smith, 2021)
interface CarVehicle {
    void setDoors(int doors);
    int getDoors();
    void setFuelType(String fuel);
    String getFuelType();
}

// Interface for Motorcycle-specific behavior (Lee, 2020)
interface MotorVehicle {
    void setWheels(int wheels);
    int getWheels();
    void setMotorType(String type);
    String getMotorType();
}

// Interface for Truck-specific behavior (Anderson, 2019)
interface TruckVehicle {
    void setCargoCapacity(double capacity);
    double getCargoCapacity();
    void setTransmission(String transmission);
    String getTransmission();
}

// Car class implementing Vehicle and CarVehicle
class Car implements Vehicle, CarVehicle {
    private String make, model, fuelType;
    private int year, doors;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setDoors(int doors) { this.doors = doors; }
    public int getDoors() { return doors; }

    public void setFuelType(String fuel) { this.fuelType = fuel; }
    public String getFuelType() { return fuelType; }
}

// Motorcycle class implementing Vehicle and MotorVehicle
class Motorcycle implements Vehicle, MotorVehicle {
    private String make, model, motorType;
    private int year, wheels;

    public Motorcycle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setWheels(int wheels) { this.wheels = wheels; }
    public int getWheels() { return wheels; }

    public void setMotorType(String type) { this.motorType = type; }
    public String getMotorType() { return motorType; }
}

// Truck class implementing Vehicle and TruckVehicle
class Truck implements Vehicle, TruckVehicle {
    private String make, model, transmission;
    private int year;
    private double cargoCapacity;

    public Truck(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setCargoCapacity(double capacity) { this.cargoCapacity = capacity; }
    public double getCargoCapacity() { return cargoCapacity; }

    public void setTransmission(String transmission) { this.transmission = transmission; }
    public String getTransmission() { return transmission; }
}

// Main class to test the program
public class VehicleRentalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Car
        System.out.println("=== Enter Car Information ===");
        System.out.print("Make: ");
        String carMake = scanner.nextLine();
        System.out.print("Model: ");
        String carModel = scanner.nextLine();
        System.out.print("Year: ");
        int carYear = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Car car = new Car(carMake, carModel, carYear);

        System.out.print("Number of doors: ");
        int doors = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel type (Petrol/Diesel/Electric): ");
        String fuel = scanner.nextLine();
        car.setDoors(doors);
        car.setFuelType(fuel);

        // Input for Motorcycle
        System.out.println("\n=== Enter Motorcycle Information ===");
        System.out.print("Make: ");
        String motoMake = scanner.nextLine();
        System.out.print("Model: ");
        String motoModel = scanner.nextLine();
        System.out.print("Year: ");
        int motoYear = scanner.nextInt();
        scanner.nextLine();

        Motorcycle bike = new Motorcycle(motoMake, motoModel, motoYear);

        System.out.print("Number of wheels: ");
        int wheels = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Motorcycle type (Sport/Cruiser/Off-road): ");
        String type = scanner.nextLine();
        bike.setWheels(wheels);
        bike.setMotorType(type);

        // Input for Truck
        System.out.println("\n=== Enter Truck Information ===");
        System.out.print("Make: ");
        String truckMake = scanner.nextLine();
        System.out.print("Model: ");
        String truckModel = scanner.nextLine();
        System.out.print("Year: ");
        int truckYear = scanner.nextInt();
        scanner.nextLine();

        Truck truck = new Truck(truckMake, truckModel, truckYear);

        System.out.print("Cargo capacity (tons): ");
        double capacity = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Transmission type (Manual/Automatic): ");
        String transmission = scanner.nextLine();
        truck.setCargoCapacity(capacity);
        truck.setTransmission(transmission);

        scanner.close();

        // Output results
        System.out.println("\n=== Vehicle Details ===");
        System.out.println("Car: " + car.getMake() + " " + car.getModel() + " (" + car.getYear() + ")"
                + " | Doors: " + car.getDoors() + " | Fuel: " + car.getFuelType());

        System.out.println("Motorcycle: " + bike.getMake() + " " + bike.getModel() + " (" + bike.getYear() + ")"
                + " | Wheels: " + bike.getWheels() + " | Type: " + bike.getMotorType());

        System.out.println("Truck: " + truck.getMake() + " " + truck.getModel() + " (" + truck.getYear() + ")"
                + " | Cargo: " + truck.getCargoCapacity() + " tons | Transmission: " + truck.getTransmission());
    }
}
