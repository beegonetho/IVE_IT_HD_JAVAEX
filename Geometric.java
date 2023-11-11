/**
 * @(#)Geometric.java
 *
 *
 * @author 
 * @version 1.00 2023/9/28
 */


import java.util.Scanner;
public class Geometric{

   public static void main( String[] args ) {
      // Create a Scanner object for console input
    	Scanner input =new Scanner(System.in);
      //Declare variables
    	int S;
        int a;
		int R;
		int n;

		System.out.println( " S=a(R^n-1)/R-1 " );
		
		System.out.println("a=");
		a = input.nextInt(); //input value into total from keyboard
		
		System.out.println("R=");
		R = input.nextInt(); //input value into total from keyboard
		
		System.out.println("n=");
		n = input.nextInt(); //input value into total from keyboard
		
		S = a;
		S *= (Math.pow(R, n)-1);
		S /=(R-1);
		
		System.out.println("S="+S);






   }
}
