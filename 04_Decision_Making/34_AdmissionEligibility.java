import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter your entrance exam score: ");
        int entranceScore = sc.nextInt();

        if (marks >= 60) {

            if (entranceScore >= 70) {
                System.out.println("You are eligible for admission.");
            } else {
                System.out.println("Entrance exam score is too low.");
            }

        } else {
            System.out.println("Academic marks are too low.");
        }

        sc.close();
    }
}
