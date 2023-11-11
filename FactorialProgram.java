/**
 * @(#)test.java
 *
 *
 * @author 
 * @version 1.00 2023/10/19
 */

import java.util.Scanner;
public class FactorialProgram {

	public static void main( String[] args ) {
	
		Scanner input =new Scanner(System.in);
		int fact,total=1;
	
		System.out.print("n?");
		fact = input.nextInt(); //input value into total from keyboard
		
		int n = fact;  
			
		while (fact>1){
	
			total*=fact;
			fact--;
		
		}
		
		System.out.println(n+"! = "+total);
	
	}
	
	}	