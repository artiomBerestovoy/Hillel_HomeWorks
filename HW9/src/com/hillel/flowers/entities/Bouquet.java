package com.hillel.flowers.entities;

import java.util.Arrays;

public class Bouquet {
    private Flower[] flowers;
    private Accessory[] accessories;

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public Accessory[] getAccessories() {
        return accessories;
    }

    public void setAccessories(Accessory[] accessories) {
        this.accessories = accessories;
    }

    public int getCost() {
        return countFlowersCost() + countAccessoriesCost();
    }

    private int countFlowersCost() {
        int amount = 0;

        for (Flower f : flowers) {
            amount += f.getCost();
        }
        return amount;
    }

    private int countAccessoriesCost() {
        if (accessories == null){
            return 0;
        }
        int amount = 0;

        for (Accessory a : accessories) {
            amount += a.getCost();
        }
        return amount;
    }
    @Override
    public String toString() {
        return "Bouquet:\n" +
                "Flowers = " + Arrays.toString(flowers) +
                "\nAccessories = " + Arrays.toString(accessories) +
                "\nCost = " + getCost();
    }
}
