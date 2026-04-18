/*
Name: Ahmed Bakri
ID: 452045303
*/
package concrete.vehicles;

import concrete.exceptions.InvalidRentalDaysException;

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

    public boolean isAvailable = true;

    public Vehicle(int vehicleId, String make, float baseDailyRate) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.baseDailyRate = baseDailyRate;
    }

    public Vehicle(int vehicleId, String make, float baseDailyRate, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.baseDailyRate = baseDailyRate;
        this.isAvailable = isAvailable;
    }

    public float calculateRentalCost(int days) throws InvalidRentalDaysException {
        if (days < 1) {
            throw new InvalidRentalDaysException("Days must be greater than 0.");
        }
        return days * baseDailyRate;
    }

    public void printVehicleDetails(int days) {
        float cost = calculateRentalCost(days);
        System.out.println("Vehicle ID: " + getVehicleId());
        System.out.println("Make: " + getMake());
        System.out.println("Total Cost for " + days + " days: " + cost);
        System.out.println("---------------------------");
    }

}
