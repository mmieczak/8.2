package data;

public class Truck extends Car {
    private double cargoWeight;
    private static final double COOLING_FUEL_IMPACT = 1.6;
    private static final double CARGO_FUEL_IMPACT = 0.5;

    public Truck(String name, double tankCapacity, double avarageFuelConsumption, boolean isCoolingOn, double cargoWeight) {
        super(name, tankCapacity, avarageFuelConsumption, isCoolingOn);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateRange() {
        double maxRange;
        if (isCoolingOn())
            maxRange = 100 * getTankCapacity() / (getAverageFuelConsumption() + COOLING_FUEL_IMPACT + (CARGO_FUEL_IMPACT * cargoWeight / 100));
        else
            maxRange = super.calculateRange();
        return maxRange;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Name: " + getName() + ", " +
                "Tank Capacity: " + getTankCapacity() + ", " +
                "Average Fuel Consumption: " + getAverageFuelConsumption() + ", " +
                "isCoolingOn=" + isCoolingOn() + ", " +
                "cargoWeight=" + cargoWeight + ", " +
                "MAX RANGE=" + calculateRange() +
                '}';
    }
}


