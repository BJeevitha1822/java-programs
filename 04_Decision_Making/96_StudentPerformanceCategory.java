import java.util.Scanner;

public class StudentPerformanceCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        if (marks < 0 || marks > 100 || attendance < 0 || attendance > 100) {
            System.out.println("Invalid input.");
        } else if (marks >= 90 && attendance >= 90) {
            System.out.println("Performance: Outstanding");
        } else if (marks >= 75 && attendance >= 80) {
            System.out.println("Performance: Excellent");
        } else if (marks >= 60 && attendance >= 75) {
            System.out.println("Performance: Good");
        } else if (marks >= 50 && attendance >= 65) {
            System.out.println("Performance: Average");
        } else {
            System.out.println("Performance: Needs Improvement");
        }

        sc.close();
    }
}
