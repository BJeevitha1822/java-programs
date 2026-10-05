import java.util.Scanner;

public class OnlinePaymentStatus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter payment status (success/failed): ");
        String status = sc.next();

        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
        } else if (status.equalsIgnoreCase("success")) {
            System.out.println("Payment successful.");
            System.out.printf("Amount paid: Rs. %.2f%n", amount);
        } else if (status.equalsIgnoreCase("failed")) {
            System.out.println("Payment failed.");
        } else {
            System.out.println("Invalid payment status.");
        }

        sc.close();
    }
}
