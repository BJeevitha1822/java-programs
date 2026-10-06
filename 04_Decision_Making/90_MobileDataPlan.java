import java.util.Scanner;

public class MobileDataPlan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data usage in GB: ");
        double data = sc.nextDouble();

        if (data < 0) {
            System.out.println("Invalid data usage.");
        } else if (data <= 1) {
            System.out.println("Plan: Basic");
            System.out.println("Charge: Rs. 99");
        } else if (data <= 3) {
            System.out.println("Plan: Standard");
            System.out.println("Charge: Rs. 199");
        } else if (data <= 5) {
            System.out.println("Plan: Premium");
            System.out.println("Charge: Rs. 299");
        } else {
            System.out.println("Plan: Unlimited");
            System.out.println("Charge: Rs. 499");
        }

        sc.close();
    }
}
