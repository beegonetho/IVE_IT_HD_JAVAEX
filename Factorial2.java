import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n? ");
        int n = scanner.nextInt();

        int factorial = 1;
        StringBuilder equation = new StringBuilder();

        for (int i = n; i >= 1; i--) {
            factorial *= i;
            equation.append(i);
            if (i != 1) {
                equation.append(" x ");
            }
        }

        System.out.println(equation + " = " + factorial);

        scanner.close();
    }
}