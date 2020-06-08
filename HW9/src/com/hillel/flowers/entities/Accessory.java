package com.hillel.flowers.entities;

public class Accessory {
    private String name;
    private int cost;

    public Accessory(String name,int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return  name + '{' +
                " cost = " + cost +
                '}';
    }
}
