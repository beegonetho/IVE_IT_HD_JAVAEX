/**
 * @(#)test.java
 *
 *
 * @author 
 * @version 1.00 2023/10/19
 */

import java.util.Scanner;
public class AvgValues2 {

	public static void main( String[] args ) {
	
	Scanner input =new Scanner(System.in);
	int sum,total=0,count;
	double average;
    
	for (count=0;count>=0;count++){
	
		System.out.print("Values?");
		sum = input.nextInt();
	
		if(sum<=0){
	
			break;	
		}
	
		total+=sum;   	
		
	
	}
	average = (double) total/count;
	System.out.println("Average ="+average);

}

}	