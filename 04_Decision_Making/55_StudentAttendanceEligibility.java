import java.util.Scanner;

public class StudentAttendanceEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        System.out.print("Enter medical certificate (yes/no): ");
        String medicalCertificate = sc.next();

        if (attendance >= 75) {
            System.out.println("Eligible to attend the examination.");
        } else if (attendance >= 60 && medicalCertificate.equalsIgnoreCase("yes")) {
            System.out.println("Eligible with medical consideration.");
        } else {
            System.out.println("Not eligible to attend the examination.");
        }

        sc.close();
    }
}
