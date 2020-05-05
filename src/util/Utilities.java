package util;

import data.Car;
import data.Vehicle;

public class Utilities {

    public static void dsiplayVehicles(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("\t" + vehicle);
        }
    }

    public static void turnCoolingForAll(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            ((Car) vehicle).setCoolingOn(true);
        }
    }
}
