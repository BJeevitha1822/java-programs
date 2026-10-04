import java.util.Scanner;

public class CompleteInputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("\n========== STUDENT DETAILS ==========");

        System.out.printf("%-15s : %s%n", "Name", name);
        System.out.printf("%-15s : %d%n", "Age", age);
        System.out.printf("%-15s : %.2f cm%n", "Height", height);
        System.out.printf("%-15s : %c%n", "Grade", grade);
        System.out.printf("%-15s : %b%n", "Student", isStudent);

        System.out.println("=====================================");

        sc.close();
    }
}
