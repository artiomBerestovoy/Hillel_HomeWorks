package com.hillel.flowers.entities;

import java.util.Arrays;

public class FlowerShop {
    private Bouquet[] bouquets;

    public Bouquet[] getBouquets() {
        return bouquets;
    }
    public void setBouquets(Bouquet[] bouquets) {
        this.bouquets = bouquets;
    }

    @Override
    public String toString() {
        return "bouquets = " + Arrays.toString(bouquets);
    }
}
