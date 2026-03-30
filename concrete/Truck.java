package ProjectPhase1.concrete;

public class Truck extends Vehicle {
    private final float loadCapacity; // In tons.

    public Truck(int vehicleId, String make, float baseDailyRate, float loadCapacity) {
        super(vehicleId, make, baseDailyRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public float getBaseDailyRate() {
        return super.getBaseDailyRate() + (this.loadCapacity * 20f);
    }
}
