package Inheritance;

import java.util.Scanner;

public class VehicleMNGT {
    // Base class
    class Vehicle{
        String brand;
        int speed;

        public Vehicle(String brand, int speed) {
            this.brand = brand;
            this.speed = speed;
        }

        void displayInfo(){
            System.out.println("Brand:"+brand);
            System.out.println("Speed:"+speed+"km/h");
        }
    }

    //derived class car
    class Car extends Vehicle{
        int numDoors;

        Car(String brand,int speed,int numDoors){
            super(brand,speed);
            this.numDoors=numDoors;
        }

        void displayCarDetails(){
            displayInfo();
            System.out.println("Number of Doors:"+numDoors);
        }
    }

    //dervied class bike
    class Bike extends Vehicle{
        boolean hasCarrier;

        Bike(String brand, int speed,boolean hasCarrier) {
            super(brand, speed);
            this.hasCarrier=hasCarrier;
        }

        void displayBikeDetails() {
            displayInfo();
            System.out.println("Has carrier:"+(hasCarrier?"Yes":"No"));
        }
    }

    // Main class to get user input and show details
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleMNGT vm = new VehicleMNGT();

        // Get car info
        System.out.println("Enter car info:");
        System.out.print("Brand: ");
        String carBrand = sc.nextLine();
        System.out.print("Speed: ");
        int carSpeed = sc.nextInt();
        System.out.print("Doors: ");
        int doors = sc.nextInt();
        sc.nextLine(); // clear the newline

        Car car = vm.new Car(carBrand, carSpeed, doors);
        System.out.println("\nCar Info:");
        car.displayCarDetails();

        System.out.println();

        // Get bike info
        System.out.println("Enter bike info:");
        System.out.print("Brand: ");
        String bikeBrand = sc.nextLine();
        System.out.print("Speed: ");
        int bikeSpeed = sc.nextInt();
        System.out.print("Carrier (true/false): ");
        boolean carrier = sc.nextBoolean();

        Bike bike = vm.new Bike(bikeBrand, bikeSpeed, carrier);
        System.out.println("\nBike Info:");
        bike.displayBikeDetails();

        sc.close();
    }
}