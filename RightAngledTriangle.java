import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double sideA = kb.nextDouble();
        
        System.out.print("Enter the length of side b: ");
        double sideB = kb.nextDouble();
        
        System.out.print("Enter the length of side c: ");
        double sideC = kb.nextDouble();
        
        if (isRightAngledTriangle(sideA, sideB, sideC)) {
            System.out.println("The triangle is a right-angled triangle.");
        } else {
            System.out.println("The triangle is not a right-angled triangle.");
        }
    }
    
    public static boolean isRightAngledTriangle(double a, double b, double c) {
        double aSquared = Math.pow(a, 2);
        double bSquared = Math.pow(b, 2);
        double cSquared = Math.pow(c, 2);
        
        return aSquared + bSquared == cSquared || aSquared + cSquared == bSquared || bSquared + cSquared == aSquared;
    }
}