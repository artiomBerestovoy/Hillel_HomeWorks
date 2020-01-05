package ua.nure.berestovoy.practice1;

import java.util.Arrays;

public class Part6 {

    public static void main(String[] args) {
        int[] numbArray = new int[Integer.parseInt(args[0])];

        for (int i = 2, j = 0; j < numbArray.length; i++) {
            boolean isPrime = true;
            int count = 0;

            for (int k = 2; isPrime; k++) {
                if ((i % k) == 0) {
                    count++;
                }
                if (count > 1) {
                    isPrime = false;
                }
                if (k == i) {
                    isPrime = false;
                }
            }
            if (count == 1) {
                numbArray[j++] = i;
            }
        }
        System.out.println(Arrays.toString(numbArray));
    }

}