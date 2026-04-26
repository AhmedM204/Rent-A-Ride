/*
Name: Ahmed Bakri
ID: 452045303
*/
package concrete.vehicles;

import concrete.Customer;
import concrete.exceptions.InvalidRentalDaysException;
import concrete.exceptions.VehicleNotAvailableException;

public abstract class Vehicle {
    private int vehicleId;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    private String make;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    protected float baseDailyRate;

    public float getBaseDailyRate() {
        return baseDailyRate;
    }

    public void setBaseDailyRate(float baseDailyRate) {
        this.baseDailyRate = baseDailyRate;
    }

    private boolean isAvailable;

    public Vehicle(int vehicleId, String make, float baseDailyRate, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.baseDailyRate = baseDailyRate;
        this.isAvailable = isAvailable;
    }

    protected void checkDays(int days) throws InvalidRentalDaysException {
        if (days < 1) {
            throw new InvalidRentalDaysException("Days must be greater than 0.");
        }
    }

    protected void checkAvailability() throws VehicleNotAvailableException {
        if(!isAvailable) throw new VehicleNotAvailableException("Vehicle is not available for rental.");
    }

    public float calculateRentalCost(int days) throws InvalidRentalDaysException, VehicleNotAvailableException {
        checkAvailability();
        checkDays(days);
        return days * baseDailyRate;
    }

    public void printVehicleDetails(Customer customer, int days) throws VehicleNotAvailableException {
        float cost = calculateRentalCost(days);
        System.out.println("Rental Summary for " + customer.getName() + " for " + days + " days:");
        System.out.println("Vehicle ID: " + getVehicleId());
        System.out.println("Make: " + getMake());
        System.out.println("Total Cost for " + days + " days: " + cost);
        System.out.println("---------------------------");
    }

}
