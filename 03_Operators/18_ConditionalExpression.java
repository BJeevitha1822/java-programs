import java.util.Scanner;

public class ConditionalExpression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String result = (marks >= 50) ? "Pass" : "Fail";

        System.out.println("\n--- Conditional Operator ---");
        System.out.println("Result: " + result);

        sc.close();
    }
}
