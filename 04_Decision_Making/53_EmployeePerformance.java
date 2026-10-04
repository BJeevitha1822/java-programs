import java.util.Scanner;

public class EmployeePerformance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee rating (1-5): ");
        int rating = sc.nextInt();

        if (rating == 5) {
            System.out.println("Performance: Outstanding");
        } else if (rating == 4) {
            System.out.println("Performance: Excellent");
        } else if (rating == 3) {
            System.out.println("Performance: Good");
        } else if (rating == 2) {
            System.out.println("Performance: Needs Improvement");
        } else if (rating == 1) {
            System.out.println("Performance: Poor");
        } else {
            System.out.println("Invalid rating.");
        }

        sc.close();
    }
}
