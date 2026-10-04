import java.util.Scanner;

public class ElectricityBillCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if (units <= 100) {
            System.out.println("Low consumption.");
        } else if (units <= 200) {
            System.out.println("Medium consumption.");
        } else if (units <= 500) {
            System.out.println("High consumption.");
        } else {
            System.out.println("Very high consumption.");
        }

        sc.close();
    }
}
