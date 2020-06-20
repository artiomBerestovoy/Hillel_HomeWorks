package com.berestovoy.entity;

import com.berestovoy.Util.Filter;

public class PrimeNumbers {
    private Filter[] filters;
    private PrimesArray primesArray = new PrimesArray();
    private int max;
    private int min;
    private int threadsQuantity;

    public PrimeNumbers(int max, int min, int threadsQuantity) {
        this.max = max;
        this.min = min;
        this.threadsQuantity = threadsQuantity;
    }

    public PrimesArray getPrimesArray() {
        return primesArray;
    }

    public void run() {

        int step = max / threadsQuantity;
        int minVal = min;
        int maxVal = step;
        filters = new Filter[threadsQuantity];


        for (int i = 0 ; i < threadsQuantity; i++) {
            filters[i] = new Filter(("Thread " ) + (i + 1), minVal, maxVal, this);
            minVal = maxVal + 1;

            if ( i == threadsQuantity - 2) {
                maxVal = max;
            } else {
                maxVal += step;
            }
        }
        for (int k = 0; k < filters.length; k++) {
            try {
                filters[k].getT().join();
            }catch (InterruptedException e) {
                System.out.println("Tread is interrupted");
            }

        }

        printArray();
    }

    private void printArray() {

        System.out.println(primesArray);
    }
}
