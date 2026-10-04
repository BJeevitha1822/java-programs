import java.util.Scanner;

public class ArithmeticExpression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int sum = a + b + c;
        int difference = a - b - c;
        int product = a * b * c;
        int average = sum / 3;

        System.out.println("\n--- Arithmetic Expressions ---");

        System.out.println("Sum        : " + sum);
        System.out.println("Difference : " + difference);
        System.out.println("Product    : " + product);
        System.out.println("Average    : " + average);

        sc.close();
    }
}
