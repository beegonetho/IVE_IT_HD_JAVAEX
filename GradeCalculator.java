roots_of_a_quadratic_equation.java
/**
 * @(#)roots of a quadratic equation.java
 *
 *
 * @author 
 * @version 1.00 2023/10/5
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class roots_of_a_quadratic_equation_v2 {

    public static void main(String[] args) {
    	
    	
     	// Create a Scanner object for console input
    	Scanner input =new Scanner(System.in);   	
    	
    	
    	//declear variables
  		int b,a,c,d;
  		double x1,x2;
  		
  		System.out.print( " a: " );
    	a =  input.nextInt(); //input value into total from keyboard
	
		System.out.print( " b: " );
    	b =  input.nextInt(); //input value into total from keyboard
			
    	System.out.print( " c: " );
    	c =  input.nextInt(); //input value into total from keyboard
		
		d= b-4*a*c;
		
		
		if (a==0 || b==0){
		 System.out.println("This is not a quadratic equation." );
		}
		
		else if (d>=0)
			{
		
	    	x1= -b - Math.sqrt(b*b-4*a*c);
	    	x1/= (2*a);
	    	x2= -b + Math.sqrt(b*b-4*a*c);
	    	x2/= (2*a);
	    	
	        if(d=0)
	    		{
	    
	    		System.out.println("1 roots,"+"x:"+x1 " );
	    	
    		}
    		
    		else
    			
    			{
    
    		
    			System.out.println("2 roots,"+"x1:"+x1 "x2:"+x2 );
    			
    		}
    			
    			
       	}
       	else
       		{
       		System.out.println("No real solution");
       	}
    	

    		
    		
    	
    	
    	
    	
    }
    
    
}