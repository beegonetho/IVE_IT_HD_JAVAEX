/**
 * @(#)compund_interest.java
 *
 *
 * @author 
 * @version 1.00 2023/9/21
 */

import java.util.Scanner;
public class compund_interest {

    public static void main(String[] args) {
    	
    	// Create a Scanner object for console input
    	Scanner input =new Scanner(System.in);
    	
    	//Declear vairables
    	int year;
    	int total;
    	double interest;
    	
	    System.out.print( " Enter your bank money: " );
	    total = input.nextInt(); //input value into total from keyboard
	    
	    System.out.print( " Enter the bank interest: " );
	    interest = input.nextDouble();
	    
	    System.out.print( " how many years you wanna cook: ");
	    year = input.nextInt();
	    
	    for (int i = 0; i < year; i++) {
			total+= (total*interest);
		}
	    
    	System.out.println( "ur total amount is $" + total); //the total after compounded interest
    	
    }
    
    
}