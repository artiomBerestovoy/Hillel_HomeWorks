package com.hillel.berestovoy.utils;

import com.hillel.berestovoy.vehicles.Vehicle;

public class ArrayUtils {

    public static Vehicle[] extendArrayByLength(Vehicle[] current, Vehicle vehicleToAdd) {
      if (current.length == 0) {
            return new Vehicle[]{vehicleToAdd};
        }
        Vehicle temp[] = new Vehicle[current.length + 1];
        for (int i = 0; i < current.length; i++) {
            temp[i] = current[i];
        }
        temp[current.length] = vehicleToAdd;
        return temp;
    }

}
