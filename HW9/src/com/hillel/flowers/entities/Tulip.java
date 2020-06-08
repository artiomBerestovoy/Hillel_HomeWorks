package com.hillel.flowers.entities;

public class Tulip extends Flower {
    public Tulip(int fresh, int stemLength, int cost) {
        super("Tulip", fresh, stemLength, cost);
    }

    @Override
    public String toString() {
        return  getName() + '{' +
                " fresh = " + getFresh() +
                ", stemLength = " + getStemLength() +
                '}';
    }
}
