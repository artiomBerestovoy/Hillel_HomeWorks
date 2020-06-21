package com.hillel.berestovoy.vehicles;

import com.hillel.berestovoy.utils.*;

public class CarCreator {
    private Storage storage;
    private Vehicle[] vehicles = new Vehicle[0];

    public CarCreator(Storage storage) {
        this.storage = storage;
    }

    public Vehicle[] createVehiclesAr(){
        String[] arrayOfdescriptions = storage.readFile();
        //System.out.println("length: " + arrayOfdescriptions.length);
        /*for (String s : arrayOfdescriptions) {
            System.out.println(s);
            System.out.println("next");
        }*/

        for (int i = 0; i < arrayOfdescriptions.length; i++) {
            addVehicle(createVehicle(arrayOfdescriptions[i]));
        }
        return vehicles;
    }

    private Vehicle createVehicle(String description) {

        //System.out.println("Next->");
        //System.out.println(description);
        String[] s = description.split(",");
       // for (String ss : s) {
        //    System.out.println(ss);
        //}
        String type = s[0];
        int cost = Integer.valueOf(s[1]);
        int fuelConsumption = Integer.valueOf(s[2]);
        int speed = Integer.valueOf(s[3]);
        int particularArg = Integer.valueOf(s[4]);
        String mark = s[5];
        //System.out.println("Type = " + type + " cost = " + cost + " fuelC = " + fuelConsumption
         //       + " speed = " + speed + " Particular = " + particularArg + " mark = " + mark);

        switch (type){
            case "Bus":
                //System.out.println("Bus " + cost + fuelConsumption + speed + particularArg + mark + mark);
                return new Bus(cost, fuelConsumption, speed, particularArg, mark);
            case "Van":
                //System.out.println("Van " + cost + fuelConsumption + speed + particularArg + mark+ mark);
                return new Van(cost, fuelConsumption, speed, particularArg, mark);
            case "SportCar":
                //System.out.println("SportCar " + cost + fuelConsumption + speed + particularArg + mark+ mark);
                return new SportCar(cost, fuelConsumption, speed, particularArg, mark);
            default:
                break;
        }
        return null;
    }

    private void addVehicle(Vehicle vehicleToAdd) {
        //System.out.println("addVehicle: " + vehicleToAdd);
        vehicles = ArrayUtils.extendArrayByLength(vehicles, vehicleToAdd);
    }

    public void saveVehicles(Vehicle[] vehiclesToSave) {
        StringBuilder stringToSave = new StringBuilder();

        for (int i = 0; i < vehiclesToSave.length; i++) {
            stringToSave.append(vehDescrToString(vehiclesToSave[i]));

            if (i < vehiclesToSave.length - 1){
                stringToSave.append('\n');
            }
        }
        stringToSave.deleteCharAt(stringToSave.length() - 1);
        storage.writeToFile(stringToSave.toString());
    }

    private String vehDescrToString(Vehicle vehicle) {
        StringBuilder objToStr = new StringBuilder();
        Class clazz = vehicle.getClass();
        String name = clazz.getSimpleName();

        objToStr.append(name);
        objToStr.append(',');
        objToStr.append(vehicle.getCost());
        objToStr.append(',');
        objToStr.append(vehicle.getFuelConsumption());
        objToStr.append(',');
        objToStr.append(vehicle.getSpeed());
        objToStr.append(',');

        switch (name){
            case "Bus":
                objToStr.append(((Bus)vehicle).getQuantityOfSeats());
                break;
            case "Van":
                objToStr.append(((Van)vehicle).getTrunkVolume());
                break;
            case "SportCar":
                objToStr.append(((SportCar)vehicle).getPower());
                break;
            default:
                break;
        }
        objToStr.append(',');
        objToStr.append(vehicle.getMark());
        objToStr.append(';');

        return objToStr.toString();
    }
}
