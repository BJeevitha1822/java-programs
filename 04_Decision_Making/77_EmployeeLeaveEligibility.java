import java.util.Scanner;

public class EmployeeLeaveEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        System.out.print("Enter number of leave days requested: ");
        int leaveDays = sc.nextInt();

        if (years < 0 || leaveDays <= 0) {
            System.out.println("Invalid input.");
        } else if (years >= 5 && leaveDays <= 30) {
            System.out.println("Leave approved.");
            System.out.println("Eligible for extended leave.");
        } else if (years >= 2 && leaveDays <= 20) {
            System.out.println("Leave approved.");
        } else if (years < 2 && leaveDays <= 10) {
            System.out.println("Leave approved.");
        } else {
            System.out.println("Leave request rejected.");
        }

        sc.close();
    }
}
