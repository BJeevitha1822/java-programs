import java.util.Scanner;

public class LogicalExpression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.println("\n--- Logical Expressions ---");

        System.out.println("Age >= 18 AND Marks >= 50 : " + (age >= 18 && marks >= 50));
        System.out.println("Age >= 18 OR Marks >= 50  : " + (age >= 18 || marks >= 50));
        System.out.println("NOT (Age >= 18)           : " + !(age >= 18));

        sc.close();
    }
}
