import java.util.Scanner;

public class VehicleTypeUsingSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle code (C/B/T): ");
        char vehicle = sc.next().charAt(0);

        switch (vehicle) {
            case 'C':
            case 'c':
                System.out.println("Vehicle: Car");
                System.out.println("Category: Four Wheeler");
                break;

            case 'B':
            case 'b':
                System.out.println("Vehicle: Bike");
                System.out.println("Category: Two Wheeler");
                break;

            case 'T':
            case 't':
                System.out.println("Vehicle: Truck");
                System.out.println("Category: Heavy Vehicle");
                break;

            default:
                System.out.println("Invalid vehicle code.");
        }

        sc.close();
    }
}
