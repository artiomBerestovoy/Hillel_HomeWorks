package ua.nure.berestovoy.practice1;

public class Part7 {
    private static final int ABC_SIZE = 26;
    private static final int OFFSET_TO_A = 64;
	
    public static void main(String[] args) {

    	System.out.println("A ==> 1 ==> A\n" + "B ==> 2 ==> B\n" 
    			+ "Z ==> 26 ==> Z\n" + "AA ==> 27 ==> AA\n" 
    			+ "AZ ==> 52 ==> AZ\n" + "BA ==> 53 ==> BA\n"
    			+ "ZZ ==> 702 ==> ZZ\n" + "AAA ==> 703 ==> AAA");
    }
    
    public static int str2int(String number) {
        char[] bufArray = number.toCharArray();
        int result = 0;
        
        for (int i = bufArray.length - 1, j = 0; i >= 0; i--, j++) {
            result = result + (bufArray[i] - OFFSET_TO_A) * ((int) Math.pow(ABC_SIZE, j));
        }
        return result;
    }
    
    public static String int2str(int number) {
        StringBuilder result = new StringBuilder("");
                
        while (number != 0) {
            
            if ((number % ABC_SIZE) != 0) {
                result.insert(0, (char) ((number % ABC_SIZE) + OFFSET_TO_A));
                number -= (number % ABC_SIZE);
            } else {
                result.insert(0, 'Z');
                number -= ABC_SIZE;
            }
            
            if (number != 0) {
                number /= ABC_SIZE;
            }
            
        }
        return result.toString();
    }
    
    public static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }

}
