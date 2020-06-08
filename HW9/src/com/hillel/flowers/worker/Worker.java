package com.hillel.flowers.worker;

import com.hillel.flowers.entities.*;
import com.hillel.flowers.exception.*;

import java.util.Scanner;

public class Worker {
    FlowerShop shop;
    Scanner scan = new Scanner(System.in);

    void run() {
        shop = new FlowerShop();

        do {
            System.out.println("1. Create bouquet");
            System.out.println("2. Print bouquets");
            System.out.println("0.Exit ");
            System.out.print("-> ");

            int input = scan.nextInt();

            switch (input){
                case 1:
                    shop.setBouquets(extendBouquetAr(shop.getBouquets(),createBouquet(new Bouquet())));
                    break;
                case 2:
                    System.out.println(shop);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                   continue;
            }
            System.out.println();
        } while (true);
    }

    private Bouquet createBouquet(Bouquet bouquet) {
        do {
            System.out.println("\n1. Add flower");
            System.out.println("2. Add accessory");
            System.out.println("3. Print bouquet");
            System.out.println("4. Sotr bouquet");
            System.out.println("5. Finish");
            System.out.println("0. Leave the store");
            System.out.print("-> ");

            int input = scan.nextInt();

            switch(input){
                case 1:
                    bouquet.setFlowers(extendFlowerAr(bouquet.getFlowers(),chooseFlower()));
                    break;
                case 2:
                    bouquet.setAccessories(extendAccessoriesAr(bouquet.getAccessories(), createAccessory()));
                    break;
                case 3:
                    System.out.println(bouquet);
                    break;
                case 4:
                    bouquet = sortBouquet(bouquet);
                    break;
                case 5:
                    return bouquet;
                case 0:
                    System.exit(0);
                default:
                    continue;
            }
        } while (true);
    }

    private Bouquet sortBouquet(Bouquet bouquetToSort) {
        if (bouquetToSort == null) {
            System.out.println("Bouquet is empty");
            return null;
        }
        do {
            System.out.println("1. Sort the bouquet by fresh");
            System.out.println("2. Find flower by length");
            System.out.println("3. Finish");

            int input = scan.nextInt();

            switch (input) {
                case 1:
                    bouquetToSort.setFlowers(sortByFresh(bouquetToSort.getFlowers()));
                    break;
                case 2:
                    Flower flower = findFlower(bouquetToSort.getFlowers());
                    if (flower == null) {
                        System.out.println("There isn't the flower");
                        break;
                    }
                    System.out.println(flower);
                    break;
                case 3:
                    return bouquetToSort;
                default:
                    continue;
            }
            return bouquetToSort;
        } while (true);
    }
    private Flower findFlower(Flower[] flowers) {
        do {
            System.out.println("Set min stem length -> ");
            int min = scan.nextInt();
            System.out.println("Set max stem length -> ");
            int max = scan.nextInt();
            try{
                if ((min < 0) | (max < 0)) {
                    throw new IllegalLengthOfStamException();
                }
            } catch (IllegalLengthOfStamException ex) {
                System.out.println("You have entered illegal value of length");
                continue;
            }

            return findFlowerByLength(flowers, min ,max);
        } while (true);
    }

    private Flower findFlowerByLength(Flower[] flowers, int min, int max) {
        for (Flower f : flowers) {
            if ((min < f.getStemLength()) &&(f.getStemLength() < max)){
                return f;
            }
        }
        return null;
    }

    private Flower[] sortByFresh(Flower[] flowers) {
        for (int i = flowers.length; i >= 0; i--) {
            for (int k = 0; k < i; k++) {
                if (flowers[k].getFresh() > flowers[k + 1].getFresh()){
                    Flower tempFlower = flowers[k];
                    flowers[k] = flowers[k + 1];
                    flowers[k + 1] = tempFlower;
                }
            }
        }
        return flowers;
    }

    private Accessory createAccessory() {
        do {
            System.out.print("\nSet name -> ");
            String name = scan.next();

            System.out.print("Cost -> ");
            int cost = scan.nextInt();

            return new Accessory(name, cost);
        } while (true);
    }

    private Flower chooseFlower() {
        do {
            System.out.println("Choose a flower");
            System.out.println("1. Rose");
            System.out.println("2. Tulip");
            System.out.println("3. Chamomile");
            System.out.println("0. Leave the store");
            System.out.print("-> ");
            int input = scan.nextInt();

            switch (input) {
                case 1:
                    return createFlower("Rose");
                case 2:
                    return createFlower("Tulip");
                case 3:
                    return createFlower("Chamomile");
                default :
                    System.out.println("You have entered illegal value of length. Retry again");
                    continue;
            }
        } while (true);
    }

    private Flower createFlower(String flower) {
        do {
            System.out.print("\nSet fresh-> ");
            int fresh = scan.nextInt();

            System.out.print("\nSet stem's length-> ");
            int stemLength = scan.nextInt();
            if (stemLength < 0) {
                try {
                    throw new IllegalLengthOfStamException();
                } catch (IllegalLengthOfStamException ex) {
                    System.out.println("You have entered illegal value of length. Retry again");
                    continue;
                }
            }

            System.out.print("\nSet cost-> ");
            int cost = scan.nextInt();

            switch (flower) {
                case "Rose":
                    return new Rose( fresh, stemLength, cost);
                case "Tulip":
                    return new Tulip( fresh, stemLength, cost);
                case "Chamomile":
                    return new Chamomile( fresh, stemLength, cost);
            }
        } while (true);
    }

    private Flower[] extendFlowerAr(Flower[] array, Flower newFlower) {
        if (array == null) {
            return new Flower[]{newFlower};
        }

        Flower[] temp = new Flower[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array [i];
        }
        temp[array.length] = newFlower;
        return temp;
    }

    private Bouquet[] extendBouquetAr(Bouquet[] array, Bouquet bouquet) {
        if (array == null) {
            return new Bouquet[]{bouquet};
        }

        Bouquet[] temp = new Bouquet[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array [i];
        }
        temp[array.length] = bouquet;
        return temp;
    }

    private Accessory[] extendAccessoriesAr(Accessory[] array, Accessory accessory) {
        if (array == null) {
            return new Accessory[]{accessory};
        }

        Accessory[] temp = new Accessory[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array [i];
        }
        temp[array.length] = accessory;
        return temp;
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.run();
    }
}
