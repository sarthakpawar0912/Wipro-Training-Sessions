package VehicleInterface;

public class VehicleImpl {

    //this is Interface 1: Vehicle
    interface Vehicle {

        default void message() {

            System.out.println("Inside Vehicle");

        }
    }

    // Interface 2: FourWheeler
    interface FourWheeler {

        default void message() {

            System.out.println("Inside FourWheeler");

        }
    }

    // Class Car implementing both interfaces
    static class Car implements Vehicle, FourWheeler {

        @Override
        public void message() {

            Vehicle.super.message();

            System.out.println("Inside Car");

        }
    }

}

