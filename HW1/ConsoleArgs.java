public class ConsoleArgs{
    public static void main(String[] args){
 
        for (int i = args.length; i > 0; i--) {
            System.out.print(args[i - 1] + " ");
        }
    }
}