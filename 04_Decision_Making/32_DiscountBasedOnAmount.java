import java.util.Scanner;

public class DiscountBasedOnAmount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        double discount;

        if (amount >= 10000) {
            discount = amount * 0.20;
        } else if (amount >= 5000) {
            discount = amount * 0.10;
        } else if (amount >= 2000) {
            discount = amount * 0.05;
        } else {
            discount = 0;
        }

        double finalAmount = amount - discount;

        System.out.printf("Discount: %.2f%n", discount);
        System.out.printf("Final amount: %.2f%n", finalAmount);

        sc.close();
    }
}
