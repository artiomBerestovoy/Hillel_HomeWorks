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
        Vehicle[] bufArray;
        
        for (int i = 0; i < allVehicle.length; i++) {
            if ((allVehicle[i].getSpeed() >= minSpeed) && (allVehicle[i].getSpeed() <= maxSpeed)) {
               
                if (fastest.length == 0) {
                    fastest = new Vehicle[1];
                    fastest[0] = allVehicle[i];
                } else {
                    bufArray = new Vehicle[fastest.length + 1];
                    
                    for (int j = 0; j < bufArray.length; j++) {
                
                        if (j == bufArray.length - 1) {
                            bufArray[j] = allVehicle[i];
                            fastest = bufArray;
                            break;
                        }
                        bufArray[j] = fastest[j];
                    }
                }
            }
        }
        return fastest;
    }
}
