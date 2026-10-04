import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (age >= 18) {
            System.out.println("Age requirement satisfied.");

            if (marks >= 50) {
                System.out.println("You are eligible.");
            } else {
                System.out.println("Marks requirement not satisfied.");
            }

        } else {
            System.out.println("Age requirement not satisfied.");
        }

        sc.close();
    }
}
