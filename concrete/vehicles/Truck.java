/*
 * Name: Abdulrahman Nahshal
 * ID: 452033303
 */

package concrete.vehicles;

import concrete.interfaces.Maintainable;

public class Truck extends Vehicle implements Maintainable {
    private float loadCapacity; // In tons.

    public Truck(int vehicleId, String make, float baseDailyRate, float loadCapacity) {
        super(vehicleId, make, baseDailyRate);
        this.setLoadCapacity(loadCapacity);
    }

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(float loadCapacity) {
        if(loadCapacity > 0) {
            this.loadCapacity = loadCapacity;
        } else {
            this.loadCapacity = 1;
        }
    }

    @Override
    public float calculateRentalCost(int days) {
        return (baseDailyRate + (this.loadCapacity * 20f)) * days;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Checking hydraulic system on the truck..");
        System.out.println("Seems good to go!");
    }
}
