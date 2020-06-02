package com.hillel.berestovoy.park;

import com.hillel.berestovoy.vehicles.*;

public class AvtoparkImpl implements Avtopark {
    
    private Vehicle[] allVehicle;
    
    public Vehicle[] getAllVehicle() {
        return allVehicle;
    }

    public void setAllVehicle(Vehicle[] allVehicle) {
        this.allVehicle = allVehicle;
    }

    public AvtoparkImpl(Vehicle[] allVehicle) {
        this.allVehicle = allVehicle;
    }
    
    @Override
    public int costCount() {
        int amount = 0;
        
        for (int i = 0; i < allVehicle.length; i++) {
            amount += allVehicle[i].getCost();
        }
        return amount;
    }
    
    @Override
    public void sortByFuelConsumption() {
        boolean isSorted = false;
        int buf;
        
        while(!isSorted) {
            isSorted = true;
            
            for (int i = 0; i < allVehicle.length - 1; i++) {
                
                if (allVehicle[i].getFuelConsumption() > allVehicle[i + 1].getFuelConsumption()) {
                    isSorted = false;
                
                    buf = allVehicle[i].getFuelConsumption();
                    allVehicle[i].setFuelConsumption(allVehicle[i + 1].getFuelConsumption());
                    allVehicle[i + 1].setFuelConsumption(buf);
                }
            }
        }
    }
    
    @Override
    public Vehicle[] serchFastest(int minSpeed, int maxSpeed) {
        Vehicle[] fastest = new Vehicle[0];

        for (int i = 0; i < allVehicle.length; i++) {
            if ((allVehicle[i].getSpeed() >= minSpeed) && (allVehicle[i].getSpeed() <= maxSpeed)) {
                fastest = externdArray(fastest, allVehicle[i]);
            }
        }
        return fastest;
    }

    private Vehicle[] externdArray(Vehicle[] vehicles, Vehicle newVeh){
        if (vehicles.length == 0) {
            return vehicles = new Vehicle[]{newVeh};

        }
        Vehicle[] bufArray = new Vehicle[vehicles.length + 1];

        for ( int i = 0; i < vehicles.length; i++) {
            bufArray[i] = vehicles[i];
        }
        bufArray[vehicles.length] = newVeh;
        return bufArray;
    }
}
