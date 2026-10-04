import java.util.Scanner;

public class OperatorPrecedenceWithParentheses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int result1 = a + b * c;
        int result2 = (a + b) * c;
        int result3 = a * (b + c);
        int result4 = (a + b) * (b + c);

        System.out.println("\n--- Operator Precedence with Parentheses ---");

        System.out.println("a + b * c         = " + result1);
        System.out.println("(a + b) * c       = " + result2);
        System.out.println("a * (b + c)       = " + result3);
        System.out.println("(a + b) * (b + c) = " + result4);

        sc.close();
    }
}
