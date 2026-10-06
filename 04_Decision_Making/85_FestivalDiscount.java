import java.util.Scanner;

public class FestivalDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter festival (diwali/pongal/christmas): ");
        String festival = sc.next();

        double discount;

        if (amount <= 0) {
            System.out.println("Invalid purchase amount.");
        } else if (festival.equalsIgnoreCase("diwali")) {
            discount = 20;
            System.out.println("Festival: Diwali");
            System.out.println("Discount: 20%");
        } else if (festival.equalsIgnoreCase("pongal")) {
            discount = 15;
            System.out.println("Festival: Pongal");
            System.out.println("Discount: 15%");
        } else if (festival.equalsIgnoreCase("christmas")) {
            discount = 10;
            System.out.println("Festival: Christmas");
            System.out.println("Discount: 10%");
        } else {
            discount = 0;
            System.out.println("Festival not available.");
        }

        double discountAmount = amount * discount / 100;
        double finalAmount = amount - discountAmount;

        System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
        System.out.printf("Final Amount: Rs. %.2f%n", finalAmount);

        sc.close();
    }
}
