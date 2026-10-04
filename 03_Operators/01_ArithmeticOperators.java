import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.println("\n--- Arithmetic Operations ---");

        System.out.println("Addition       : " + (first + second));
        System.out.println("Subtraction    : " + (first - second));
        System.out.println("Multiplication : " + (first * second));
        System.out.println("Division       : " + (first / second));
        System.out.println("Modulus        : " + (first % second));

        sc.close();
    }
}
