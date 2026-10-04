import java.util.Scanner;

public class OnlineShoppingEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter membership status (yes/no): ");
        String membership = sc.next();

        if (amount >= 5000 && membership.equalsIgnoreCase("yes")) {
            System.out.println("Eligible for premium discount.");
        } else if (amount >= 5000 || membership.equalsIgnoreCase("yes")) {
            System.out.println("Eligible for regular discount.");
        } else {
            System.out.println("Not eligible for discount.");
        }

        sc.close();
    }
}
