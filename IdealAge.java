import java.util.Scanner;

public class IdealAge {
    public static void main(String[] args) {
    	System.out.println("man's age:");
        Scanner kb = new Scanner(System.in);
        int manAge = kb.nextInt();
        int wifeAge = idealAge(manAge);
        System.out.println("Ideal age of wife = " + wifeAge);
    }

    public static int idealAge(int manAge) {
        int idealAge = (manAge / 2) + 7;
        return idealAge;
    }
}