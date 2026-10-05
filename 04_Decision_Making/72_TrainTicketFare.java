import java.util.Scanner;

public class TrainTicketFare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();

        System.out.print("Enter ticket type (1-3): ");
        int ticketType = sc.nextInt();
        
        double fare;

        if (ticketType == 1) {
            fare = 500;
        } else if (ticketType == 2) {
            fare = 800;
        } else if (ticketType == 3) {
            fare = 1200;
        } else {
            System.out.println("Invalid ticket type.");
            sc.close();
            return;
        }

        if (age < 5) {
            fare = 0;
        } else if (age <= 12) {
            fare = fare * 0.50;
        } else if (age >= 60) {
            fare = fare * 0.70;
        }

        System.out.printf("Final ticket fare: Rs. %.2f%n", fare);

        sc.close();
    }
}
