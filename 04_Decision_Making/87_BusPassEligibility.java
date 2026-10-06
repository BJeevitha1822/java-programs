import java.util.Scanner;

public class BusPassEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter student status (yes/no): ");
        String student = sc.next();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age <= 25 && student.equalsIgnoreCase("yes")) {
            System.out.println("Eligible for student bus pass.");
        } else if (age >= 60) {
            System.out.println("Eligible for senior citizen bus pass.");
        } else {
            System.out.println("Eligible for regular bus pass.");
        }

        sc.close();
    }
}
