import java.util.Scanner;

public class FormattedStudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("\n--- Student Details ---");

        System.out.printf("%-15s : %s%n", "Name", name);
        System.out.printf("%-15s : %d%n", "Age", age);
        System.out.printf("%-15s : %.2f%n", "CGPA", cgpa);

        sc.close();
    }
}
