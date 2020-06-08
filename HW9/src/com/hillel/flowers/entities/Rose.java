package com.hillel.flowers.entities;

public class Rose extends Flower {
    public Rose( int fresh, int stemLength, int cost) {
        super("Rose", fresh, stemLength, cost);
    }
    @Override
    public String toString() {
        return  getName() + '{' +
                " fresh = " + getFresh() +
                ", stemLength = " + getStemLength() +
                '}';
    }

}
