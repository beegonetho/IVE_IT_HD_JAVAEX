/**
 * @(#)test.java
 *
 *
 * @author 
 * @version 1.00 2023/10/19
 */

import java.util.Scanner;
public class AvgValues {

	public static void main( String[] args ) {
	
	Scanner input =new Scanner(System.in);
	int count,sum,total=0,j;
	double average;
    
   System.out.print("How many values to enter?");
   count = input.nextInt(); //input value into total from keyboard
  
   for (j=0;j<count;j++){

	System.out.print("Values?");
	sum = input.nextInt();
	
	total+=sum;   

   }

	average = (double) total/count;
	

	System.out.println("Average ="+average);

}

}	