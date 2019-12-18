import java.util.Arrays;

public class Runner {

    Avtopark park;
    Vehicle[] allVehicle = { new Van(15_000, 5, 220, 1500, "VW caddy"),
            new Van(28_000, 7, 220, 2500, "Mercedes Vito"),
            new Van(32_000, 9, 240, 2500, "VW T5"),
            new Bus(22_900, 11, 200, 20, "Mercedes Sprinter"),
            new Bus(46_700, 10, 210, 15, "Ford Transit"),
            new Bus(38_400, 9, 220, 17, "VW Crafter"),
            new SportCar(45_800, 12, 280, 405, "Lexus LS 460"),
            new SportCar(78_900, 15, 295, 500, "Mercedes S500 AMG"),
            new SportCar(88_880, 17, 320, 578, "Audi S8 Plus"), };

    public void run() {
        park = new Avtopark(allVehicle);
        
        System.out.print("All vehicles: ");
        System.out.println(Arrays.toString(allVehicle));
        System.out.println("Cost of the avtopark: " + park.costCount() + "$");
        System.out.print("Vehicles sorted by the fuel consumption: ");
        park.sortByFuelConsumption();
        System.out.println(Arrays.toString(allVehicle));
        System.out.print("Vehicles with a given speed range. 230 - 300(km/h): ");
        System.out.println(Arrays.toString(park.serchFastest(230, 300)));
        
    }

    public static void main(String[] args) {
        Runner start = new Runner();
        start.run();
    }

}
