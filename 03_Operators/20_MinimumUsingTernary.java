import java.util.Scanner;

public class MinimumUsingTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int minimum = (a < b) ? a : b;

        System.out.println("\n--- Minimum Using Ternary Operator ---");
        System.out.println("Minimum number: " + minimum);

        sc.close();
    }
}
