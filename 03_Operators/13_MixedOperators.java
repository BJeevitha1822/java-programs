import java.util.Scanner;

public class MixedOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int result = a + b * c - a / b;    // frst b*c then a/b then (a + b*c ans) - a/b(ans)

        System.out.println("\n--- Mixed Operators ---");
        System.out.println("Result = " + result);
    }
}
