import java.util.Scanner;

public class OperatorSummary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n--- Operator Summary ---");

        // Arithmetic
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division       : " + (a / b));
        System.out.println("Remainder      : " + (a % b));

        // Relational
        System.out.println("\na == b : " + (a == b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));

        // Logical
        System.out.println("\nBoth positive : " + (a > 0 && b > 0));
        System.out.println("At least one positive : " + (a > 0 || b > 0));

        // Ternary
        int maximum = (a > b) ? a : b;
        System.out.println("\nMaximum : " + maximum);

        // Increment
        a++;
        System.out.println("After incrementing a : " + a);

        // Decrement
        b--;
        System.out.println("After decrementing b : " + b);

        sc.close();
    }
}
