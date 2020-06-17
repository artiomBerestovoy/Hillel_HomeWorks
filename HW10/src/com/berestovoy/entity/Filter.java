package com.berestovoy.entity;

public class Filter implements Runnable {
    private String name;
    private int min;
    private int max;
    private PrimeNumbers primeNumbers;
    Thread t;

    public Filter(String name, int min, int max, PrimeNumbers primeNumbers) {
        this.name = name;
        this.min = min;
        this.max = max;
        this.primeNumbers = primeNumbers;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        filterNumbers();
    }

    private void filterNumbers() {
        for (int i = min; i <= max; i++) {
            if ((i % 2 == 0 ) & (i != 2)){
                continue;
            }

            if ((i % 3 == 0) & (i != 3)){
                continue;
            }

            if ((i % 5 == 0) & (i != 5)){
                continue;
            }

            if ((i % 7 == 0) & (i != 7)){
                continue;
            }

            if (isPrime(i)) {
                primeNumbers.getPrimesArray().add(i);
            }
        }
    }

    private boolean isPrime(int i) {
        int count = 0;
        for (int k = 2; k <= i; k++) {
            if ( i % k == 0) {
                count++;
            }

            if (count > 1) {
                return false;
            }
        }

        if (count == 1) {
            return true;
        }

        return false;
    }
}
