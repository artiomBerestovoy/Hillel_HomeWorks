public class PrimeNumbers {

    public static void main(String[] args) {

        /* Define and initialize the array */
        int[] numbArray = {5, 48, 3, 33, 7, 67, 98, 17, 46,};

        /* Iterate over the array */
        for (int i : numbArray) {
            int count = 0;

            for (int k = 2; k < 100; k++) {
                if ((i % k) == 0) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(i);
            }
        }
    }

}
