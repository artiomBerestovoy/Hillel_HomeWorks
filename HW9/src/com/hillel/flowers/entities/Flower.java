package com.hillel.flowers.entities;

public abstract class Flower {
    private String name;
    private int fresh;
    private int stemLength;
    private int cost;

    public Flower(String name,int fresh, int stemLength, int cost) {
        this.name = name;
        this.fresh = fresh;
        this.stemLength = stemLength;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getFresh() {
        return fresh;
    }

    public int getStemLength() {
        return stemLength;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return  name + '{' +
                " fresh = " + fresh +
                ", stemLength = " + stemLength +
                '}';
    }
}
