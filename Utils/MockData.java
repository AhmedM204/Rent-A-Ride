package Utils;

import concrete.Customer;
import concrete.vehicles.Car;
import concrete.vehicles.Motorbike;
import concrete.vehicles.Truck;
import concrete.vehicles.Vehicle;

public class MockData {
    public static Vehicle[] getVehicles() {

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car(1, "Toyota", 100);
        vehicles[1] = new Car(2, "BMW", 200, true);
        vehicles[2] = new Truck(3, "Ford", 150, 3);
        vehicles[3] = new Motorbike(4, "Yamaha", 50);
        return vehicles;
    }

    public static Customer[] getCustomers() {
        Customer[] customers = new Customer[2];
        customers[0] = new Customer(1, "Ahmed");
        customers[1] = new Customer(2, "Abdulrahman");
        return customers;
    }
}
