/*
 * Name: Abdulrahman Nahshal
 * ID: 452033303
 */

package concrete.vehicles;

import concrete.interfaces.Maintainable;

public class Motorbike extends Vehicle implements Maintainable {
    public Motorbike(int vehicleId, String make, float baseDailyRate) {
        super(vehicleId, make, baseDailyRate);
    }

    @Override
    public float calculateRentalCost(int days) {
        float rate = super.getBaseDailyRate() - 10f;
        return rate < 0 ? 0 : rate * days;
    }

    @Override
    public void performMaintenance() {
        System.out.println("Lubricating the motorbike chain..");
        System.out.println("It is done!");
    }
}
