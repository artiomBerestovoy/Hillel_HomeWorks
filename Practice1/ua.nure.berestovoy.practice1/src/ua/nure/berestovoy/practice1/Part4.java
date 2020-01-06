package ua.nure.berestovoy.practice1;

public class Part4 {
    private static int max;
    private static int min;
    
    public static void main(String[] args) {
        
        if (Integer.parseInt(args[0]) < Integer.parseInt(args[1])) {
            max = Integer.parseInt(args[1]);
            min = Integer.parseInt(args[0]);
        } else {
            max = Integer.parseInt(args[0]);
            min = Integer.parseInt(args[1]);
        }
        if ((max % min) != 0) {
            biggestGeneralDivider(max, min);
        } else {
            System.out.println(min);
        }
    }
    
    public static void biggestGeneralDivider(int big, int little) {
        int divider;
        
        while (true) {
            divider = big - little;
            
            if (((max %  divider) == 0) && ((min %  divider) == 0)) {
                                
                System.out.println(divider);
                break;
            }
            big = little;
            little = divider;
        }
        
    }

}
