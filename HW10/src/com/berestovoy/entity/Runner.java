package com.berestovoy.entity;

import com.berestovoy.entity.PrimeNumbers;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set min value -> ");
        int min = scanner.nextInt();

        System.out.println("Set max value -> ");
        int max = scanner.nextInt();

        System.out.println("Set quantity of threads -> ");
        int threadsQuantity = scanner.nextInt();

        PrimeNumbers pn = new PrimeNumbers(max, min, threadsQuantity);
        pn.run();
    }
}
