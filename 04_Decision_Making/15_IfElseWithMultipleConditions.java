import java.util.Scanner;

public class IfElseWithMultipleConditions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (age >= 18 && marks >= 50) {
            System.out.println("You are eligible.");
        } else {
            System.out.println("You are not eligible.");
        }

        sc.close();
    }
}
