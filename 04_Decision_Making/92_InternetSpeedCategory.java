import java.util.Scanner;

public class InternetSpeedCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter internet speed in Mbps: ");
        double speed = sc.nextDouble();

        if (speed < 0) {
            System.out.println("Invalid speed.");
        } else if (speed < 10) {
            System.out.println("Category: Slow");
        } else if (speed < 50) {
            System.out.println("Category: Average");
        } else if (speed < 100) {
            System.out.println("Category: Fast");
        } else {
            System.out.println("Category: Very Fast");
        }

        sc.close();
    }
}
