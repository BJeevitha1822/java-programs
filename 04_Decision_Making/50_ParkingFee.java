import java.util.Scanner;

public class ParkingFee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of hours parked: ");
        int hours = sc.nextInt();

        double fee;

        if (hours <= 2) {
            fee = hours * 20; 
        } else if (hours <= 5) {
            fee = (2 * 20) + ((hours - 2) * 30);
        } else if (hours <= 10) {
            fee = (2 * 20) + (3 * 30) + ((hours - 5) * 40);
        } else {
            fee = (2 * 20) + (3 * 30) + (5 * 40)
                    + ((hours - 10) * 50);
        }

        System.out.printf("Parking fee: %.2f%n", fee);

        sc.close();
    }
}
