import java.util.Scanner;

public class array_random_sum {
 public static void main( String[] args ) {
      // Create a Scanner object for console input
    	Scanner scanf =new Scanner(System.in);
      
      //Declare variables
      	int[] total;
      	int num,i;
      	
      	System.out.print("Number of random numbers:");
      	num=scanf.nextInt();
      		 
      	total = new int[num];
      	
      	int sum = 0;
      	for(i=0;i<num;i++){
			
			int rand = (int) (Math.random()*100);
      		total[i] = rand;
      		System.out.println(total[i]);
      		sum+=total[i];

      		
      	}
    
      	
      	System.out.println("sum="+sum);
      	
 	}
 
 }