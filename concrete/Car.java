package ProjectPhase1.concrete;

public class Car extends Vehicle {
    private boolean isLuxuryCar = false;

    public boolean isLuxuryCar() {
        return isLuxuryCar;
    }

    public void setLuxuryCar(boolean isLuxuryCar) {
        this.isLuxuryCar = isLuxuryCar;
    }

    public Car(int vehicleId, String make, float baseDailyRate) {
        super(vehicleId, make, baseDailyRate);
    }

    public Car(int vehicleId, String make, float baseDailyRate, boolean isLuxuryCar) {
        super(vehicleId, make, baseDailyRate);
        this.isLuxuryCar = isLuxuryCar;
    }

    @Override
    public float calculateRentalCost(int days) {
        if (isLuxuryCar)
            return (baseDailyRate + 50) * days;

        return super.calculateRentalCost(days);
    }

}
