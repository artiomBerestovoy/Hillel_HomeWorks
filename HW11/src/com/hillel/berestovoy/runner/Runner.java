package com.hillel.berestovoy.runner;

import java.util.Arrays;
import com.hillel.berestovoy.vehicles.*;
import com.hillel.berestovoy.park.*;

public class Runner {
    private Storage storage;
    public Runner(String fileName){
        storage = new Storage(fileName);
    }
    public void run() {
        CarCreator cc = new CarCreator(storage);
        Vehicle[] allVehicle = cc.createVehiclesAr();
        Avtopark park = new AvtoparkImpl(allVehicle);


        System.out.print("All vehicles: ");
        System.out.println(Arrays.toString(allVehicle));
        System.out.println();

        System.out.println("Cost of the avtopark: " + park.costCount() + "$");
        System.out.println();

        System.out.print("Vehicles sorted by the fuel consumption: ");
        allVehicle = park.sortByFuelConsumption();
        cc.saveVehicles(allVehicle);
        System.out.println(Arrays.toString(allVehicle));
        System.out.println();

        System.out.print("Vehicles with a given speed range. 230 - 300(km/h): ");
        System.out.println(Arrays.toString(park.searchFastest(230, 300)));

    }

    public static void main(String[] args) {
        Runner start = new Runner("Storage.txt");
        start.run();
    }

}
