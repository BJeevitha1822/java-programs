import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        System.out.println("\n--- Bitwise Operations ---");

        System.out.println("AND (&)  : " + (first & second));
        System.out.println("OR (|)   : " + (first | second));
        System.out.println("XOR (^)  : " + (first ^ second));
        System.out.println("NOT (~)  : " + (~first));
        System.out.println("Left Shift (<<)  : " + (first << 1));
        System.out.println("Right Shift (>>) : " + (first >> 1));

        sc.close();
    }
}
