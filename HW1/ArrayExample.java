public class ArrayExample{
    public static void main(String[] args) {
        int[] exampArray = { 4, 5, 12, 68, 8, 3, 71, 3};

        System.out.println();

        for (int i : exampArray) {
            System.out.println(i + "\n");
        }
        System.out.println();
     
        for (int i : exampArray) {
            System.out.print(i + ", ");
        }
    }
}
