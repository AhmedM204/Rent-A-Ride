/*
 * Name: Abdulrahman Nahshal
 * ID: 452033303
 */

package concrete;

public class Motorbike extends Vehicle {
    public Motorbike(int vehicleId, String make, float baseDailyRate) {
        super(vehicleId, make, baseDailyRate);
    }

    @Override
    public float calculateRentalCost(int days) {
        float rate = super.getBaseDailyRate() - 10f;
        return rate < 0 ? 0 : rate * days;
    }
}
