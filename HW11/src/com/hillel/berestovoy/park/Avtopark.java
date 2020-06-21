package com.hillel.berestovoy.park;

import com.hillel.berestovoy.entities.*;

public interface Avtopark {

    int costCount();

    Vehicle[] sortByFuelConsumption();

    Vehicle[] searchFastest(int minSpeed, int maxSpeed);

}