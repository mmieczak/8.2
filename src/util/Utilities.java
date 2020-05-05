package util;

import data.Vehicle;

public class Utilities {

    public static void dsiplayVehicles(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("\t" + vehicle);
        }
    }
}
