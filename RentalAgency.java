
/*
Name: Ahmed Bakri
ID: 452045303

 Name: Abdulrahman Nahshal
 ID: 452033303
 */

import Utils.Helpers;
import Utils.MockData;
import concrete.Customer;
import concrete.exceptions.InvalidRentalDaysException;
import concrete.exceptions.VehicleNotAvailableException;
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
            try {
                Helpers.printCustomerVehicleInfo(customers[customerSelection - 1], vehicles[vehicleSelection - 1],
                        daysSelection);
            } catch (VehicleNotAvailableException e) {
                System.out.println(e.getMessage());
                continue; // Skip the rest of the loop and start over
            } catch (InvalidRentalDaysException e) {
                System.out.println(e.getMessage());
                continue;
            }


            System.out.print("\n\n\n");
        }
    }
}