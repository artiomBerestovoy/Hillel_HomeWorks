
public class DoNotRepeatedNumbers {
    static int[] randArray = { 654, 58, 6, 45654, 1, 64753, 37, 556, 353, 357, 973, };
	
    public static void main(String[] args) {
        for (int val : randArray) {
            searchingDoNotRepeated(val);
        }
    }
    
    public static void searchingDoNotRepeated(int numb) {
        String s = "";
        boolean isEmpty = true;
        boolean[] matchesArray = new boolean[10];
        
        while (isEmpty) {
            int result = 0;
            
            result = numb % 10;
            
            if (!matchesArray[result]) {
                matchesArray[result] = true;
            } else {
                return;
            }
        	
            s = result + "" + s;
            numb = numb - result;
            
            if (numb > 10) {
                numb = numb / 10;
                continue;
            } else {
                System.out.print(s + ", ");
                isEmpty = false;
            }
            
        }
        
    }
    
}
