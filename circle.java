
 public class circle {
    public static void main(String[] args) {
        // Create a 2D array for the multiplication table
        int[][] mTable = new int[10][10];
        boolean Reverse=false,end=false;
        // Fill the array with multiplication table values
        for (int i = 0; i < 10; i++) {
        	
            for (int j = 0; j < 10; j++) {
                mTable[i][j] = i * j;
            }
        }

        // Print the multiplication table
        Reverse=false;end=false;
        System.out.print("     ");
        for (int i = 0; i < 10; i++) {
        	if(i==9){
        		Reverse=true;
        		System.out.printf("%3d ", i);
        	}
        	if(Reverse){
        		i--;
        		System.out.printf("%3d ", i);
        		i--;	
				if(i<0){Reverse=false;end=true;}
        	}
        	else{        	
            	System.out.printf("%3d ", i);
        	}
        	
        	if(end){
              i=10;
        	}
        }
        System.out.println();
        System.out.println("   +-------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%3d |", i);
            for (int j = 0; j < 10; j++) {
                System.out.printf("%3d ", mTable[i][j]);
            }
            System.out.println();
        }
    }
}
