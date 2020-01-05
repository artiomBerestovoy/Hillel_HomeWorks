package ua.nure.berestovoy.practice1;

public class Part7 {

    public static void main(String[] args) {
        int value;
        String s;
        
        if (args == null ) {
            System.out.println("A ==> 1 ==> A\n" + "B ==> 2 ==> B\n" 
                    + "Z ==> 26 ==> Z\n" + "AA ==> 27 ==> AA\n" 
                    + "AZ ==> 52 ==> AZ\n" + "BA ==> 53 ==> BA\n"
                    + "ZZ ==> 702 ==> ZZ\n" + "AAA ==> 703 ==> AAA");
        } else {
            System.out.print("\"" + args[0] + " ==> ");
        
            value = str2int(args[0]);    	
            System.out.print(value + " ==> ");
        
            s = int2str(value);
            System.out.println(s + "\"");
        }
    }
    
    public static int str2int(String number) {
        char[] bufArray = number.toCharArray();
        int result = 0;
        
        for (int i = bufArray.length - 1, j = 0; i >= 0; i--, j++) {
            result = result + (bufArray[i] - 64) * ((int) Math.pow(26, j));
        }
        return result;
    }
    
    public static String int2str(int number) {
        String result = "";
                
        while (number != 0) {
            
            if ((number % 26) != 0) {
                result = String.valueOf((char) ((number % 26) + 64)) + result;
                number -= (number % 26);
            } else {
                result = 'Z' + result;
                number -= 26;
            }
            
            if (number != 0) {
                number /= 26;
            }
            
        }
        return result;
    }
    
    public static String rightColumn(String number) {
        return int2str(str2int(number) + 1);
    }

}
