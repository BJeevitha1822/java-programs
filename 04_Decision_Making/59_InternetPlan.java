import java.util.Scanner;

public class InternetPlan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data usage in GB: ");
        double data = sc.nextDouble();

        if (data <= 10) {
            System.out.println("Plan: Basic");
            System.out.println("Price: Rs. 199");
        } else if (data <= 30) {
            System.out.println("Plan: Standard");
            System.out.println("Price: Rs. 399");
        } else if (data <= 60) {
            System.out.println("Plan: Premium");
            System.out.println("Price: Rs. 599");
        } else {
            System.out.println("Plan: Unlimited");
            System.out.println("Price: Rs. 799");
        }

        sc.close();
    }
}
