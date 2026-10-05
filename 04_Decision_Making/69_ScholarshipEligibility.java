import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks percentage: ");
        double marks = sc.nextDouble();

        System.out.print("Enter annual family income: ");
        double income = sc.nextDouble();

        if (marks >= 90 && income <= 300000) {
            System.out.println("Eligible for full scholarship.");
        } else if (marks >= 80 && income <= 500000) {
            System.out.println("Eligible for partial scholarship.");
        } else {
            System.out.println("Not eligible for scholarship.");
        }

        sc.close();
    }
}
