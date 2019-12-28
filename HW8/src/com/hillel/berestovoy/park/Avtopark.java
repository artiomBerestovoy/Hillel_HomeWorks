package com.hillel.berestovoy.park;

import com.hillel.berestovoy.vehicles.*;

public interface Avtopark {

    int costCount();

    void sortByFuelConsumption();

    Vehicle[] serchFastest(int minSpeed, int maxSpeed);

}