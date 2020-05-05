package data;

public class Vehicle {
    private String name;
    private double tankCapacity;
    private double avarageFuelConsumption;

    public Vehicle(String name, double tankCapacity, double avarageFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.avarageFuelConsumption = avarageFuelConsumption;
    }

    public double calculateRange() {
        return (tankCapacity / avarageFuelConsumption) * 100;
    }

    public String getName() {
        return name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getAverageFuelConsumption() {
        return avarageFuelConsumption;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", tankCapacity: " + tankCapacity +
                ", avarageFuelConsumption: " + avarageFuelConsumption +
                '}';
    }
}

