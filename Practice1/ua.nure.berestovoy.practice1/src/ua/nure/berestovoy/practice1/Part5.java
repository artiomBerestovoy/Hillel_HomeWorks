package ua.nure.berestovoy.practice1;

public class Part5 {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int result = 0;

        for (int i = 0; i < args[0].length(); i++) {
            result = result + (number % 10);
            number = number /10;
        }
        System.out.println(result);
    }

}