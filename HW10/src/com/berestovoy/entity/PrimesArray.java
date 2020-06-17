package com.berestovoy.entity;

public class PrimesArray {
    private  int[] ar = new int[0];

    public synchronized void add(int newInt) {
        if (ar.length == 0) {
            ar = new int[] {newInt};
            return;
        }

        int[] newArray = new int[ar.length + 1];

        for (int i = 0; i < ar.length; i++) {
            newArray[i] = ar[i];
        }
        newArray[ar.length] = newInt;
        ar = newArray;
    }

    private int[] sort(int [] arrayToSort) {
        for (int i = arrayToSort.length - 1; i >= 0; i--) {
            for (int k = 0; k < i; k++) {
                if (arrayToSort[k] > arrayToSort[k + 1]) {
                    int tempVel = arrayToSort[k];
                    arrayToSort[k] = arrayToSort[k + 1];
                    arrayToSort[k + 1] = tempVel;
                }
            }
        }
        return  arrayToSort;
    }

    @Override
    public synchronized String toString() {
        if (ar.length == 0) {
            return "null";
        }
        sort(ar);

        StringBuilder sb = new StringBuilder();
        sb.append('[');

        for (int i = 0; i < ar.length; i++){
            if ((i % 10 == 0) & (i != 0)){
                sb.append('\n');
            }
            sb.append('\t');
            sb.append(ar[i]);

            if (i == ar.length - 1){
                sb.append(']');
                sb.toString();
            }

            sb.append(", ");

            if ((i < 4) & (ar[i] <= 7)) {
                sb.append('\t');
            }
        }

        return sb.toString();
    }
}
