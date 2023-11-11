import java.util.*;

public class Fib {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("? ");
        int num = kb.nextInt();
        printFib(num);
    }

    public static void printFib(int num) {
        int first = 1;
        int second = 1;
        System.out.print(first);

        if (num > 1) {
            System.out.print(", " + second);
        }

        for (int i = 3; i <= num; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }

        System.out.println();
    }
}