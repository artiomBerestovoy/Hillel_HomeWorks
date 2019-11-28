/*
 *	  This is simple Java program.
 *	  Call this file "FibonacciNumbers.java"
 *	  Version 28.11.2019
 *	  Author Berestovoy Artiom
 */
public class FibonacciNumbers {

	public static void main(String[] args) {
		
		/* Define and initialize the array */
		int[] febArray = new int[20];
		
		/* Filling the array */
		for(int i = 0; i < febArray.length; i++){
			
			switch(i){
				case 0:
					febArray[i] = 1;
					break;
					
				case 1:
					febArray[i] = 1; 
					break;
				
				default: 
					febArray[i] = febArray[i-1] + febArray[i-2];
			}
		}
		for(int f:febArray){
			System.out.print(f + " ");
		}
	}

}
