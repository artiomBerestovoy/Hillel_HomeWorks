package com.hillel.berestovoy.entities;

public class Van implements Vehicle {
    private int cost;
    private int fuelConsumption;
    private int speed;
    private String mark;
    private int trunkVolume;

    public Van(int cost, int fuelConsumption, int speed, int trunkVolume, String mark) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.trunkVolume = trunkVolume;
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

    public int getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    @Override
    public String toString() {
        return "\nVan [cost = " + cost + ", fuelConsumption = " + fuelConsumption
                + ", speed = " + speed + ", trunkVolume = " + trunkVolume
                + ", mark = " + mark + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Van other = (Van) obj;
        if ((mark != other.mark) && (trunkVolume != other.trunkVolume)) {
            return false;
        }
    return true;
    }

}
