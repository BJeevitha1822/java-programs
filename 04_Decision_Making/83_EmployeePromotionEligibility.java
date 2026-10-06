import java.util.Scanner;

public class EmployeePromotionEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();

        System.out.print("Enter performance rating (1-5): ");
        int rating = sc.nextInt();

        System.out.print("Enter completed projects: ");
        int projects = sc.nextInt();

        if (experience >= 5 && rating >= 4 && projects >= 5) {
            System.out.println("Eligible for promotion.");
        } else if (experience >= 3 && rating >= 4) {
            System.out.println("Eligible for promotion review.");
        } else {
            System.out.println("Not eligible for promotion.");
        }

        sc.close();
    }
}
