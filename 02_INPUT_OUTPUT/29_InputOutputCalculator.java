import java.util.Scanner;

public class InputOutputCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        double sum = first + second;
        double difference = first - second;
        double product = first * second;
        double quotient = first / second;

        System.out.println("\n--- Calculator ---");

        System.out.printf("%-12s : %.2f%n", "Sum", sum);
        System.out.printf("%-12s : %.2f%n", "Difference", difference);
        System.out.printf("%-12s : %.2f%n", "Product", product);
        System.out.printf("%-12s : %.2f%n", "Quotient", quotient);

        sc.close();
    }
}
