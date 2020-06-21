package com.hillel.berestovoy.entities;

public class SportCar implements Vehicle {
    private int cost;
    private int fuelConsumption;
    private int speed;
    private String mark;
    private int power;

    public SportCar(int cost, int fuelConsumption, int speed, int power, String mark) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.power = power;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "\nSportCar [cost = " + cost + ", fuelConsumption = " + fuelConsumption
                + ", speed = " + speed + ", mark = " + mark
                + ", power = " + power + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        SportCar other = (SportCar) obj;
        if ((power != other.power) && (speed != other.speed)) {
            return false;
        }
        return true;
    }
}
