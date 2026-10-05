import java.util.Scanner;

public class TravelFareCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double distance = sc.nextDouble();

        double fare;

        if (distance <= 5) {
            fare = distance * 10;
        } else if (distance <= 15) {
            fare = (5 * 10) + ((distance - 5) * 8);
        } else if (distance <= 30) {
            fare = (5 * 10) + (10 * 8)
                    + ((distance - 15) * 6);
        } else {
            fare = (5 * 10) + (10 * 8) + (15 * 6)
                    + ((distance - 30) * 5);
        }

        System.out.printf("Travel fare: Rs. %.2f%n", fare);

        sc.close();
    }
}
