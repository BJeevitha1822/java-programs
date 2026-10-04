import java.util.Scanner;

public class CalculatorOutput {
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

        System.out.println("\n--- Calculator Results ---");

        System.out.printf("Sum        : %.2f%n", sum);
        System.out.printf("Difference : %.2f%n", difference);
        System.out.printf("Product    : %.2f%n", product);
        System.out.printf("Quotient   : %.2f%n", quotient);

        sc.close();
    }
}
