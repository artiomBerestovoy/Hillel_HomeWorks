
public class Recursion {

    public static void main(String[] args) {
        Recursion rec = new Recursion();
        rec.run(7);

    }
    
    public void run(int i) {
    	
        if (i == 1) {
            System.out.print(i + ", ");
            return ;
        } else {
            run(i - 1);
            System.out.print(i + ", ");
        }
        
    }

}
