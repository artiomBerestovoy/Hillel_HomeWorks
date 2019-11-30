public class EvenAndOddNumbers {

	public static void main(String[] args) {
		
		/* Define and initialize the array */		
		int[] numbArray = { 5, 48, 3, 33, 7, 67, 98, 17, 46, };
		
		/* Iterate over the array */
		for (int i : numbArray) {

			if ((i % 2) == 0) {
				System.out.println("The number " + i + " is even");
			} else {
				System.out.println("The number " + i + " is odd");
			}
		}
	}

}
