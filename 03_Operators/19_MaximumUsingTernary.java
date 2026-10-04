import java.util.Scanner;

public class MaximumUsingTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int maximum = (a > b) ? a : b;

        System.out.println("\n--- Maximum Using Ternary Operator ---");
        System.out.println("Maximum number: " + maximum);

        sc.close();
    }
}
