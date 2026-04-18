
/*
Name: Ahmed Bakri
ID: 452045303

 Name: Abdulrahman Nahshal
 ID: 452033303
 */

import Utils.Helpers;
import Utils.MockData;
import concrete.Customer;
import concrete.vehicles.Vehicle;

public class RentalAgency {
    public static void main(String[] args) {
        Customer[] customers = MockData.getCustomers();
        Vehicle[] vehicles = MockData.getVehicles();
        start(customers, vehicles);
    }

    private static void start(Customer[] customers, Vehicle[] vehicles) {
        while (true) {
            Helpers.printCustomers(customers);
            int customerSelection = Helpers.readNumber("Select a customer: ");
            Helpers.printVehicles(vehicles);
            int vehicleSelection = Helpers.readVechicles(vehicles.length);
            int daysSelection = Helpers.readDays();
            Helpers.printCustomerVehicleInfo(customers[customerSelection - 1], vehicles[vehicleSelection - 1],
                    daysSelection);
            System.out.print("\n\n\n");
        }
    }
}