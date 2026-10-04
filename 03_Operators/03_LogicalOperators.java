import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("\n--- Logical Operations ---");

        System.out.println("Age >= 18 AND Student : " + (age >= 18 && isStudent));
        System.out.println("Age >= 18 OR Student  : " + (age >= 18 || isStudent));
        System.out.println("NOT Student           : " + (!isStudent));

        sc.close();
    }
}
