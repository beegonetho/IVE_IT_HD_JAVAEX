/**
 * @(#)Breakcoins.java
 *
 *
 * @author 
 * @version 1.00 2023/9/28
 */


import java.util.Scanner;
//name Breakcoins
public class Breakcoins{
   
   public static void main( String[] args ) {
      
      // Create a Scanner object for console input
    	Scanner input =new Scanner(System.in);
      
      //Declare variables
    	double amount;
        int total;
       
    
    System.out.print( " Input an amount(minimum number, minimum amount is $0.01): " );
	    amount = input.nextInt(); //input value into total from keyboard
    
    total = amount/1000;
    System.out.println( " 1000-dollar (s): " + total);
    
    total = amount%1000/500;
    System.out.println( " 500-dollar (s): " + total);
        
    total = amount%500/100;
    System.out.println( " 100-dollar (s): " + total);
    
    total = amount%100/50;
    System.out.println( " 50-dollar (s): " + total);
    
    total = amount%50/20;
    System.out.println( " 20-dollar (s): " + total);
      
    total = amount%20/10;
    System.out.println( " 10-dollar/coin(s): " + total);
    
    total = amount%10/5;
    System.out.println( " 5 coin(s): " + total);
    
    total = amount%5/2;
    System.out.println( " 2 coin(s): " + total);
    
    total = amount%2/1;
    System.out.println( " 1 coin(s): " + total);
    
    total = amount%1/0.5;
    System.out.println( " 50 cent(s): " + total);
    
    total = amount%0.5/0.2;
    System.out.println( " 20 cent(s): " + total);
    
    total = amount%0.2/0.1;
    System.out.println( " 10 cent(s): " + total);
    
    total = amount%0.1/0.05;
    System.out.println( " 5 cent(s): " + total);
       
    total = amount%0.05/0.02;
    System.out.println( " 2 cent(s): " + total);
    
    total = amount%0.02/0.01;
    System.out.println( " 1 cent(s): " + total);
    
   }
}
