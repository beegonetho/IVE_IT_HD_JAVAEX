import java.util.Scanner;

public class DivisibleBy7 {
	
public static void main(String [] args) {
	
	Scanner kb = new Scanner(System.in);
	System.out.print("? ");
	
	int num= kb.nextInt();
	
	if (isDivisibleBy7(num)) // call isDivisibleBy7() with num as argument
		
		System.out.println(num + " is divisible by 7");
	
	else
		
		System.out.println(num + " is not divisible by 7");
	
	
	
	
	}
	public static boolean isDivisibleBy7(int num) {
	boolean dum;
	num%= 7;
	dum=(num==0);
	
		return dum;
	
	}
}

/* public static boolean isDivisibleBy7(int num) {
        num %= 7;
        return num == 0;
    }
}
*/