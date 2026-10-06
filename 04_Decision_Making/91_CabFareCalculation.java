import java.util.Scanner;

public class CabFareCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();

        double fare;

        if (distance <= 0) {
            System.out.println("Invalid distance.");
        } else if (distance <= 5) {
            fare = distance * 15;
            System.out.printf("Cab fare: Rs. %.2f%n", fare);
        } else if (distance <= 15) {
            fare = distance * 12;
            System.out.printf("Cab fare: Rs. %.2f%n", fare);
        } else if (distance <= 30) {
            fare = distance * 10;
            System.out.printf("Cab fare: Rs. %.2f%n", fare);
        } else {
            fare = distance * 8;
            System.out.printf("Cab fare: Rs. %.2f%n", fare);
        }

        sc.close();
    }
}
