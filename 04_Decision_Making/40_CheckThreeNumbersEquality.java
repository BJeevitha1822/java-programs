import java.util.Scanner;

public class CheckThreeNumbersEquality {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("All three numbers are equal.");
        } else if (a == b || b == c || a == c) {
            System.out.println("Two numbers are equal.");
        } else {
            System.out.println("All three numbers are different.");
        }

        sc.close();
    }
}
