
public class TheSquareMatrix {
    static int sequenceLength;
    static int sizeMatrix;
    static int[][] numbArray;
    
    public static void main(String[] args) {
        sequenceLength = Integer.parseInt(args[0]);
    	
        searchingMatrixSize(sequenceLength);
        createMatrix(sizeMatrix);
        printMatrix();
    
    }

    public static void searchingMatrixSize(int length) {
        boolean isComplete = true;
        
        for (int i = 2; isComplete; i++) {
            
            if ((i * i) > length) {
                sizeMatrix = i;
                isComplete = false;
            }
            
        }
        
    }
    
    public static void createMatrix(int size) {
        numbArray = new int[size][size];
        int count = 0;
        int number = 0;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++, count++) {
                
                if (count < sequenceLength) {
                    numbArray[i][j] = number;
                    number++;
                } else {
                    number = 0;
                    numbArray[i][j] = number;
                }
				
            }
			
        }
		
    }
    
    public static void printMatrix() {
        
        for (int i = 0; i < sizeMatrix; i++) {
            System.out.println();
        	
            for (int j = 0; j < sizeMatrix; j++) {
                System.out.print(numbArray[i][j] + " ");
            }
			
        }
		
    }
	
}
