import java.util.Scanner;

public class EmployeeBonusEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();

        if (experience >= 5) {

            if (salary < 50000) {
                System.out.println("Employee is eligible for bonus.");
            } else {
                System.out.println("Employee is not eligible for bonus.");
            }

        } else {
            System.out.println("Employee needs more experience.");
        }

        sc.close();
    }
}
