package com.hillel.berestovoy.vehicles;

public interface Vehicle {

    int getCost();

    void setCost(int cost);

    int getFuelConsumption();

    void setFuelConsumption(int fuelConsumption);

    int getSpeed();

    void setSpeed(int speed);

    String getMark();

    void setMark(String mark);

}