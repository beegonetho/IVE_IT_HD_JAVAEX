/**
 * @(#)test.java
 *
 *
 * @author 
 * @version 1.00 2023/10/19
 */

import java.util.Scanner;
public class Countstar {

	public static void main( String[] args ) {
	
	Scanner input =new Scanner(System.in);
	int i, j=0;
   
   String s = "";
   
   System.out.print("Number of stars?");
   i = input.nextInt(); //input value into total from keyboard
  
   while ( j < i ) {
      s += "*";
      j += 1;
   }
	
	System.out.println(" " + s );
	
}

}	