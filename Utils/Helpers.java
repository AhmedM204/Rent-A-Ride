package Utils;

import java.util.Scanner;

import concrete.Customer;
import concrete.exceptions.VehicleNotAvailableException;
import concrete.vehicles.Vehicle;

public class Helpers {

    public static void printCustomers(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            System.out.println((i + 1) + " - " + customers[i].getName());
        }
    }

    public static void printVehicles(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println((i + 1) + " - " + vehicles[i].getMake() + " - $" + vehicles[i].getBaseDailyRate());
        }
    }

    public static int readNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }

        return number;
    }

    public static int readDays() {
        int days = readNumber("Enter the number of days for rental: ");
        /* // Removed to let try catch do its job for demonstration purposes.
        while (days < 1) {
            System.out.println("Invalid input. Please enter a number greater than 0.");
            days = readNumber("Enter the number of days for rental: ");
        }*/
        return days;
    }

    public static int readVechicles(int numberOfVehicles) {
        int vehicleId = readNumber("Enter the vehicle ID: ");
        while (vehicleId < 1 || vehicleId > numberOfVehicles) {
            System.out.println("Invalid input. Please enter a number between 1 and " + numberOfVehicles + ".");
            vehicleId = readNumber("Enter the vehicle ID: ");
        }
        return vehicleId;
    }

    public static void printCustomerVehicleInfo(Customer customer, Vehicle vehicle, int days) throws VehicleNotAvailableException {
        vehicle.printVehicleDetails(customer, days);
    }
}
