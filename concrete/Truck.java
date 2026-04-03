/*
 * Name: Abdulrahman Nahshal
 * ID: 452033303
 */

package concrete;

public class Truck extends Vehicle {
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
}
