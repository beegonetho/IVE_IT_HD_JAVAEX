import java.util.Scanner;


public class bn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        int count = 0;

        System.out.println("Enter positive real numbers (up to 10 numbers). Enter a negative value to stop.");

        // Prompt the user for input until the 10th number or a negative value is entered
        while (count < 10) {
            System.out.print("Enter a number: ");
            double input = scanner.nextDouble();

            if (input < 0) {
                break;
            }

            numbers[count] = input;
            count++;
        }

        // Calculate statistics
        double sum = 0;
        double maximum = Double.MIN_VALUE;
        double minimum = Double.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            double number = numbers[i];
            sum += number;

            if (number > maximum) {
                maximum = number;
            }

            if (number < minimum) {
                minimum = number;
            }
        }

        double mean = sum / count;

        // Calculate standard deviation (for n > 1)
        double deviationSum = 0;

        if (count > 1) {
            for (int i = 0; i < count; i++) {
                double number = numbers[i];
                deviationSum += Math.pow(number - mean, 2);
            }

            double variance = deviationSum / (count - 1);
            double standardDeviation = Math.sqrt(variance);

            System.out.printf("Standard Deviation:%.2f%n", standardDeviation);
        }

        // Print statistics
        System.out.printf("Sum:%.2f%n ", sum);
        System.out.printf("Mean:%.2f%n ", mean);
        System.out.printf("Maximum:%.2f%n ", maximum);
        System.out.printf("Minimum:%.2f2%n ", minimum);
    }
}
//Test your program with the following five numbers, 1.23, 2.05, 4.0, 0.01, 0.12.  Their sum=7.41, mean=1.48, maximum=4.0, minimum=0.01, and standard deviation=1.64.