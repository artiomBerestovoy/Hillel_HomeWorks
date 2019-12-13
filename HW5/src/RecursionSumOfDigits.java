
public class RecursionSumOfDigits {

    public static void main(String[] args) {
        System.out.println(countDigits(8934));

    }
    
    public static int countDigits(int numb) {
        int tempVal;
        int result;
    	
    	if (numb < 10) {
    	    return numb;
    	}
        tempVal = numb % 10;
        result = tempVal + countDigits(numb / 10);
        return result;
    }

}
