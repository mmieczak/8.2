package data;

public class Car extends Vehicle {
    private boolean isCoolingOn;
    private static final double COOLING_FUEL_INCREASE = 0.8;

    public Car(String name, double tankCapacity, double averageFuelConsumption, boolean isCoolingOn) {
        super(name, tankCapacity, averageFuelConsumption);
        this.isCoolingOn = isCoolingOn;
    }

    public double calculateRange() {
        double maxRange;
        if (isCoolingOn)
            maxRange = 100 * getTankCapacity() / (getAverageFuelConsumption() + COOLING_FUEL_INCREASE);
        else
            maxRange = super.calculateRange();
        return maxRange;
    }

    public boolean isCoolingOn() {
        return isCoolingOn;
    }

    public void setCoolingOn(boolean coolingOn) {
        isCoolingOn = coolingOn;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Name: " + getName() + ", " +
                "Tank Capacity: " + getTankCapacity() + ", " +
                "Average Fuel Consumption: " + getAverageFuelConsumption() + ", " +
                "isCoolingOn: " + isCoolingOn + ", " +
                "MAX RANGE: " + calculateRange() +
                '}';
    }
}