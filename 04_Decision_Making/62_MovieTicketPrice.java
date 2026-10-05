import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        double ticketPrice;

        if (age < 5) {
            ticketPrice = 0;
        } else if (age <= 12) {
            ticketPrice = 100;
        } else if (age <= 59) {
            ticketPrice = 200;
        } else {
            ticketPrice = 120;
        }

        if (age < 0) {
            System.out.println("Invalid age.");
        } else {
            System.out.printf("Ticket price: Rs. %.2f%n", ticketPrice);
        }

        sc.close();
    }
}
