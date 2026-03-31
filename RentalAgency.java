
/*
Name: Ahmed Bakri
ID: 452045303
*/
import concrete.Car;
import concrete.Customer;
import concrete.Motorbike;
import concrete.Truck;
import concrete.Vehicle;

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

    private static int readNumber(String message) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
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
        scanner.close();

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