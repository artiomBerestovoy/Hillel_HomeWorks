package com.hillel.berestovoy.park;

import com.hillel.berestovoy.vehicles.*;
import com.hillel.berestovoy.utils.ArrayUtils;

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
    public Vehicle[] sortByFuelConsumption() {
        boolean isSorted = false;
        Vehicle buf;
        
        while(!isSorted) {
            isSorted = true;
            
            for (int i = 0; i < allVehicle.length - 1; i++) {
                
                if (allVehicle[i].getFuelConsumption() > allVehicle[i + 1].getFuelConsumption()) {
                    isSorted = false;
                
                    buf = allVehicle[i];
                    allVehicle[i] = allVehicle[i + 1];
                    allVehicle[i + 1] = buf;
                }
            }
        }
        return allVehicle;
    }
    
    @Override
    public Vehicle[] searchFastest(int minSpeed, int maxSpeed) {
        Vehicle[] fastest = new Vehicle[0];

        for (int i = 0; i < allVehicle.length; i++) {
            if ((allVehicle[i].getSpeed() >= minSpeed) && (allVehicle[i].getSpeed() <= maxSpeed)) {
                fastest = ArrayUtils.extendArrayByLength(fastest, allVehicle[i]);
            }
        }
        return fastest;
    }

}
