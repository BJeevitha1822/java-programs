import java.util.Scanner;

public class PackageDeliveryCharge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter package weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter delivery distance in km: ");
        double distance = sc.nextDouble();

        double charge;

        if (weight <= 0 || distance <= 0) {
            System.out.println("Invalid input.");
        } else if (weight <= 2 && distance <= 10) {
            charge = 50;
            System.out.printf("Delivery charge: Rs. %.2f%n", charge);
        } else if (weight <= 5 && distance <= 50) {
            charge = 100;
            System.out.printf("Delivery charge: Rs. %.2f%n", charge);
        } else if (weight <= 10 && distance <= 100) {
            charge = 200;
            System.out.printf("Delivery charge: Rs. %.2f%n", charge);
        } else {
            charge = 350;
            System.out.printf("Delivery charge: Rs. %.2f%n", charge);
        }

        sc.close();
    }
}
