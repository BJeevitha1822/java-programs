import java.util.Scanner;

public class BusTicketFare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();

        System.out.print("Enter ticket fare: ");
        double fare = sc.nextDouble();

        double finalFare;

        if (age < 0 || fare < 0) {
            System.out.println("Invalid input.");
        } else if (age < 5) {
            finalFare = 0;
            System.out.printf("Final fare: Rs. %.2f%n", finalFare);
        } else if (age <= 12) {
            finalFare = fare * 0.50;
            System.out.printf("Final fare: Rs. %.2f%n", finalFare);
        } else if (age >= 60) {
            finalFare = fare * 0.75;
            System.out.printf("Final fare: Rs. %.2f%n", finalFare);
        } else {
            finalFare = fare;
            System.out.printf("Final fare: Rs. %.2f%n", finalFare);
        }

        sc.close();
    }
}
