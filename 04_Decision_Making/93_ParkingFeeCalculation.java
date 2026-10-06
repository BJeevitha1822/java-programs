import java.util.Scanner;

public class ParkingFeeCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parking hours: ");
        double hours = sc.nextDouble();

        double fee;

        if (hours <= 0) {
            System.out.println("Invalid parking hours.");
        } else if (hours <= 2) {
            fee = 30;
            System.out.printf("Parking fee: Rs. %.2f%n", fee);
        } else if (hours <= 5) {
            fee = 60;
            System.out.printf("Parking fee: Rs. %.2f%n", fee);
        } else if (hours <= 10) {
            fee = 100;
            System.out.printf("Parking fee: Rs. %.2f%n", fee);
        } else {
            fee = 150;
            System.out.printf("Parking fee: Rs. %.2f%n", fee);
        }

        sc.close();
    }
}
