
/*
Name: Ahmed Bakri
ID: 452045303
*/
import java.util.Scanner;
import concrete.Car;
import concrete.Customer;
import concrete.Motorbike;
import concrete.Truck;
import concrete.Vehicle;

public class RentalAgency {
    private static java.util.Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        Customer[] customers = new Customer[2];

        vehicles[0] = new Car(1, "Toyota", 100);
        vehicles[1] = new Car(2, "BMW", 200, true);
        vehicles[2] = new Truck(3, "Ford", 150, 3);
        vehicles[3] = new Motorbike(4, "Yamaha", 50);

        customers[0] = new Customer(1, "Ahmed");
        customers[1] = new Customer(2, "Abdulrahman");

        while (true) {
            printCustomers(customers);
            int customerSelection = readNumber("Select a customer: ");
            printVehicles(vehicles);
            int vehicleSelection = readVechicles(vehicles.length);
            int daysSelection = readDays();
            printCustomerVehicleInfo(customers[customerSelection], vehicles[vehicleSelection], daysSelection);
            System.out.print("\n\n\n");
        }

    }

    private static void printCustomers(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            System.out.println((i + 1) + " - " + customers[i].getName());
        }
    }

    private static void printVehicles(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println((i + 1) + " - " + vehicles[i].getMake() + " - $" + vehicles[i].getBaseDailyRate());
        }
    }

    private static int readNumber(String message) {
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

    private static int readDays() {
        int days = readNumber("Enter the number of days for rental: ");
        while (days < 1) {
            System.out.println("Invalid input. Please enter a number greater than 0.");
            days = readNumber("Enter the number of days for rental: ");
        }
        return days;
    }

    private static int readVechicles(int numberOfVehicles) {
        int vehicleId = readNumber("Enter the vehicle ID: ");
        while (vehicleId < 1 || vehicleId > numberOfVehicles) {
            System.out.println("Invalid input. Please enter a number between 1 and " + numberOfVehicles + ".");
            vehicleId = readNumber("Enter the vehicle ID: ");
        }
        return vehicleId;
    }

    private static void printCustomerVehicleInfo(Customer customer, Vehicle vehicle, int days) {
        System.out.println("Rental Summary for " + customer.getName() + " for " + days + " days:");
        float cost = vehicle.calculateRentalCost(days);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle ID: " + vehicle.getVehicleId());
        System.out.println("Make: " + vehicle.getMake());
        System.out.println("Total Cost for " + days + " days: " + cost);
        System.out.println("---------------------------");
    }

}