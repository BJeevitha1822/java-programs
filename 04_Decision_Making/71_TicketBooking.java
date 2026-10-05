import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available seats: ");
        int seats = sc.nextInt();

        System.out.print("Enter number of tickets required: ");
        int tickets = sc.nextInt();

        if (tickets <= 0) {
            System.out.println("Invalid number of tickets.");
        } else if (tickets <= seats) {
            seats = seats - tickets;
            System.out.println("Booking successful.");
            System.out.println("Remaining seats: " + seats);
        } else {
            System.out.println("Booking failed.");
            System.out.println("Not enough seats available.");
        }

        sc.close();
    }
}
