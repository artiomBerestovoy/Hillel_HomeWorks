package com.hillel.berestovoy.vehicles;

public class Bus implements Vehicle {
    private int cost;
    private int fuelConsumption;
    private int speed;
    private String mark;
    private int quantityOfSieats;

    public Bus(int cost, int fuelConsumption, int speed, int quantityOfSieats, String mark) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.quantityOfSieats = quantityOfSieats;
        this.mark = mark;

    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getQuantityOfSieats() {
        return quantityOfSieats;
    }

    public void setQuantityOfSieats(int quantityOfSieats) {
        this.quantityOfSieats = quantityOfSieats;
    }

    @Override
    public String toString() {
        return "\nBus [cost = " + cost + ", fuelConsumption = " + fuelConsumption 
                + ", speed = " + speed + ", mark = " + mark
                + ", quantityOfSieats = " + quantityOfSieats + "]";
    }

    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        Bus other = (Bus) obj;
        if ((mark != other.mark) && (quantityOfSieats != other.quantityOfSieats)) {
            return false;
        }
        return true;
    }

}
