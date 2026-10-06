import java.util.Scanner;

public class ShippingCostCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter package weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter delivery distance in km: ");
        double distance = sc.nextDouble();

        double cost;

        if (weight <= 0 || distance <= 0) {
            System.out.println("Invalid input.");
        } else if (weight <= 2 && distance <= 10) {
            cost = 50;
            System.out.printf("Shipping cost: Rs. %.2f%n", cost);
        } else if (weight <= 5 && distance <= 50) {
            cost = 100;
            System.out.printf("Shipping cost: Rs. %.2f%n", cost);
        } else if (weight <= 10 && distance <= 100) {
            cost = 200;
            System.out.printf("Shipping cost: Rs. %.2f%n", cost);
        } else {
            cost = 350;
            System.out.printf("Shipping cost: Rs. %.2f%n", cost);
        }

        sc.close();
    }
}
