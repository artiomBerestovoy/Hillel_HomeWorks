public class LargestAndSmallest {

	public static void main(String[] args) {

		/* Define and initialize the array */
		int[] numbArray = { 5, 48, 3, 33, 7, 67, 98, 17, 46, };
		int smallest = numbArray[0];
		int biggest = numbArray[0];

		/* Iterate over the array */
		for (int i = 1; i < numbArray.length; i++) {

			if (numbArray[i] > biggest) {
				biggest = numbArray[i];
			} else if (numbArray[i] < smallest) {
				smallest = numbArray[i];
			}

		}

		System.out.println("Largest Number is : " + biggest);
		System.out.println("Smallest Number is : " + smallest);

	}

}
