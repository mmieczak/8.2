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
        ((Car) vehicles[0]).setCoolingOn(true);
        ((Car) vehicles[1]).setCoolingOn(true);
        ((Car) vehicles[2]).setCoolingOn(true);
        ((Truck) vehicles[3]).setCoolingOn(true);
        ((Truck) vehicles[4]).setCoolingOn(true);

        System.out.println("Cooling ON:");
        Utilities.dsiplayVehicles(vehicles);

/*        W osobnej klasie utwórz tablicę zawierającą kilka pojazdów (z wyłączoną klimatyzacją),
        wyświetl o nich podstawowe informacje oraz informację o zasięgu danego pojazdu.
                Następnie włącz klimatyzację we wszystkich pojazdach i wyświetl te same informacje jeszcze raz.*/
    }
}
