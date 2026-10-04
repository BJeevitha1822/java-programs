import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter internal marks: ");
        int internalMarks = sc.nextInt();

        if (attendance >= 75) {

            if (internalMarks >= 40) {
                System.out.println("You are eligible to attend the exam.");
            } else {
                System.out.println("Internal marks are too low.");
            }

        } else {
            System.out.println("Attendance is too low.");
        }

        sc.close();
    }
}
