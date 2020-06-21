package com.hillel.berestovoy.entities;

public class Bus implements Vehicle {
    private int cost;
    private int fuelConsumption;
    private int speed;
    private String mark;
    private int quantityOfSeats;

    public Bus(int cost, int fuelConsumption, int speed, int quantityOfSeats, String mark) {
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.quantityOfSeats = quantityOfSeats;
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

    public int getQuantityOfSeats() {
        return quantityOfSeats;
    }

    public void setQuantityOfSeats(int quantityOfSeats) {
        this.quantityOfSeats = quantityOfSeats;
    }

    @Override
    public String toString() {
        return "\nBus [cost = " + cost + ", fuelConsumption = " + fuelConsumption 
                + ", speed = " + speed + ", mark = " + mark
                + ", quantityOfSeats = " + quantityOfSeats + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Bus other = (Bus) obj;
        if ((mark != other.mark) && (quantityOfSeats != other.quantityOfSeats)) {
            return false;
        }
        return true;
    }

}
