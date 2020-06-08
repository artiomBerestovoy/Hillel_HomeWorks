package com.hillel.flowers.entities;

public class Chamomile extends Flower {

    public Chamomile(int fresh, int stemLength, int cost) {
        super("Chamomile", fresh, stemLength, cost);
    }

    @Override
    public String toString() {
        return  getName() + '{' +
                " fresh = " + getFresh() +
                ", stemLength = " + getStemLength() +
                '}';
    }

}
