
public class ShortestAndLongest {
    static int[] randArray = { 654, 58, 6, 45654, 1, 64753, 37, 556, 353, 357, 973, }; 
    static int min = randArray[0];
    static int max = randArray[0];
    
    public static void main(String[] args) {
        minMaxSearch();
        System.out.println("The shorteste is " + min + ": ");
        lengthSearch(min);
        System.out.println("The longest is " + max + ": ");
        lengthSearch(max);
    }
    
    public static void minMaxSearch() {
        for (int val : randArray) {
            
            if (val < min) {
                min = val;
            } else if (val > max) {
                max = val;
            }
			
        }
		
    }
	
    
    public static void lengthSearch(int numb) {
        String s = "";
        boolean isEmpty = true;
        
        for (int i = 0; isEmpty; i++) {
            int result = 0;
        	
            result = numb % 10;
            s = result + " " + s;
            numb = numb - result;
        	
            if (numb > 10) {
               numb = numb / 10;
               continue;
            } else {
                System.out.println("    " + (i + 1) + " numbers: " + s);
                isEmpty = false;
            }
            
        }
        
    }
    
}