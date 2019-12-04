
public class SubSet {
    static int[] bigArray = { 0, 1, 2, 3, 4, 5, 6, 7, };
    static int[] smallArray = { 3, 4, 5};
	
    public static void main(String[] args) {
        	
        for (int i = 0; i < ((bigArray.length) - (smallArray.length - 1)); i++) {
            
            if (bigArray[i] == smallArray[0]) {
            	
                for (int j = 0; j < smallArray.length; j++) {
                    
                    if (bigArray[i + j] == smallArray[j]) {
                    	
                        if (j == (smallArray.length -1)) {
                    	    System.out.println("The smaller array is part of the bigger array");
                        }
                        continue;
                    } else {
                        System.out.println("The smaller array isn't part of the bigger array");
                        break;
                    }
                }    
            }
        }
    }    
}
