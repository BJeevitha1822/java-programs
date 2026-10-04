import java.util.Scanner;

public class StudentScholarshipEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter your family income: ");
        double income = sc.nextDouble();

        if (marks >= 80) {

            if (income <= 300000) {
                System.out.println("Student is eligible for scholarship.");
            } else {
                System.out.println("Income is too high for scholarship.");
            }

        } else {
            System.out.println("Marks are too low for scholarship.");
        }

        sc.close();
    }
}
