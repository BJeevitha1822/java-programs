import java.util.Scanner;

public class TicketTypeUsingSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ticket type (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Ticket: Regular");
                System.out.println("Price: Rs. 150");
                break;

            case 2:
                System.out.println("Ticket: Premium");
                System.out.println("Price: Rs. 250");
                break;

            case 3:
                System.out.println("Ticket: VIP");
                System.out.println("Price: Rs. 400");
                break;

            default:
                System.out.println("Invalid ticket type.");
        }

        sc.close();
    }
}
