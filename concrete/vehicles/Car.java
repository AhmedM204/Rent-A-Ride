/*
Name: Ahmed Bakri
ID: 452045303
*/
package concrete.vehicles;

import concrete.interfaces.Maintainable;

public class Car extends Vehicle implements Maintainable {
    private boolean isLuxuryCar = false;

    public boolean isLuxuryCar() {
        return isLuxuryCar;
    }

    public void setLuxuryCar(boolean isLuxuryCar) {
        this.isLuxuryCar = isLuxuryCar;
    }

    public Car(int vehicleId, String make, float baseDailyRate, boolean isAvailable) {
        super(vehicleId, make, baseDailyRate, isAvailable);
    }

    public Car(int vehicleId, String make, float baseDailyRate, boolean isLuxuryCar, boolean isAvailable) {
        super(vehicleId, make, baseDailyRate, isAvailable);
        this.isLuxuryCar = isLuxuryCar;
    }

    @Override
    public float calculateRentalCost(int days) {
        if (isLuxuryCar)
            return (baseDailyRate + 50) * days;

        return super.calculateRentalCost(days);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Checking the car's engine...");
        System.out.println("it's done!");
    }

}
