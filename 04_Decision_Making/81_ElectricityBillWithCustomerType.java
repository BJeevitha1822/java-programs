import java.util.Scanner;

public class ElectricityBillWithCustomerType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        System.out.print("Enter customer type (domestic/commercial): ");
        String type = sc.next();

        double rate;

        if (units < 0) {
            System.out.println("Invalid units.");
        } else if (type.equalsIgnoreCase("domestic")) {

            if (units <= 100) {
                rate = 1.50;
            } else if (units <= 200) {
                rate = 2.50;
            } else {
                rate = 4.00;
            }

            double bill = units * rate;
            System.out.printf("Domestic bill: Rs. %.2f%n", bill);

        } else if (type.equalsIgnoreCase("commercial")) {

            if (units <= 100) {
                rate = 3.00;
            } else if (units <= 200) {
                rate = 5.00;
            } else {
                rate = 7.00;
            }

            double bill = units * rate;
            System.out.printf("Commercial bill: Rs. %.2f%n", bill);

        } else {
            System.out.println("Invalid customer type.");
        }

        sc.close();
    }
}
