import data.Car;
import data.Truck;
import data.Vehicle;
import util.Utilities;

public class Tester {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[5];

        vehicles[0] = new Car("VW Golf", 50, 5.4, false);
        vehicles[1] = new Car("Porsche Panamera", 80, 21, false);
        vehicles[2] = new Car("Mini Cooper", 50, 7, false);
        vehicles[3] = new Truck("Volvo Globtrotter", 500, 27, false, 20000);
        vehicles[4] = new Truck("Scania FX", 450, 32, false, 20000);

        System.out.println("Cooling OFF:");
        Utilities.dsiplayVehicles(vehicles);

        //Turn Cooling ON in for all objects
        Utilities.turnCoolingForAll(vehicles);

        System.out.println("Cooling ON:");
        Utilities.dsiplayVehicles(vehicles);

    }
}
