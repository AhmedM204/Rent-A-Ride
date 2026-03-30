package ProjectPhase1;

import ProjectPhase1.concrete.Car;
import ProjectPhase1.concrete.Customer;
import ProjectPhase1.concrete.Motorbike;
import ProjectPhase1.concrete.Truck;
import ProjectPhase1.concrete.Vehicle;

public class RentalAgency {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[4];

        vehicles[0] = new Car(1, "Toyota", 100);
        vehicles[1] = new Car(2, "BMW", 200, true);
        vehicles[2] = new Truck(3, "Ford", 150, 3);
        vehicles[3] = new Motorbike(4, "Yamaha", 50);

        Customer customer = new Customer(1, "Ahmed");

        int days = 3;
        System.out.println("Rental Summary for " + customer.getName() + " for " + days + " days:");
        System.out.println("---------------------------");
        for (Vehicle v : vehicles) {
            float cost = v.calculateRentalCost(days);
            System.out.println("Customer: " + customer.getName());
            System.out.println("Vehicle ID: " + v.getVehicleId());
            System.out.println("Make: " + v.getMake());
            System.out.println("Total Cost for " + days + " days: " + cost);
            System.out.println("---------------------------");
        }
    }
}