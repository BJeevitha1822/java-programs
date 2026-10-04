import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double discount;

        if (amount >= 10000) {
            discount = 20;
        } else if (amount >= 5000) {
            discount = 10;
        } else if (amount >= 2000) {
            discount = 5;
        } else {
            discount = 0;
        }

        double discountAmount = amount * discount / 100;
        double finalAmount = amount - discountAmount;

        System.out.println("Discount: " + discount + "%");
        System.out.printf("Discount Amount: %.2f%n", discountAmount);
        System.out.printf("Final Amount: %.2f%n", finalAmount);

        sc.close();
    }
}
