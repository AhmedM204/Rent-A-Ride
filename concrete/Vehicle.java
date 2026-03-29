package ProjectPhase1.concrete;

public class Vehicle {
    public int vehicleId;
    public String make;
    public float baseDailyRate;

    public Vehicle(int vehicleId, String make, float baseDailyRate) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.baseDailyRate = baseDailyRate;
    }

    public float getBaseDailyRate() {
        return baseDailyRate;
    }
}
