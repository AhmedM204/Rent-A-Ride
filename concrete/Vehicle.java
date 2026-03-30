package ProjectPhase1.concrete;

public class Vehicle {
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

    private float baseDailyRate;

    public void setBaseDailyRate(float baseDailyRate) {
        this.baseDailyRate = baseDailyRate;
    }

    public Vehicle(int vehicleId, String make, float baseDailyRate) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.baseDailyRate = baseDailyRate;
    }

    public float getBaseDailyRate() {
        return baseDailyRate;
    }
}
