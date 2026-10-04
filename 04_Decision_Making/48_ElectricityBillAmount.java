import java.util.Scanner;
public class ElectricityBillAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill;

        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 200) {
            bill = (100 * 1.50) + ((units - 100) * 2.00);
        } else if (units <= 500) {
            bill = (100 * 1.50) + (100 * 2.00)
                    + ((units - 200) * 3.00);
        }else {
            bill = (100 * 1.50) + (100 * 2.00)
                    + (300 * 3.00)
                    + ((units - 500) * 5.00);
        }
        System.out.printf("Electricity bill: %.2f%n", bill);
    }
}
/*
Different units have different rates:
       First 100 units → ₹1.50/unit
       101–200 → ₹2.00/unit
       201–500 → ₹3.00/unit
       Above 500 → ₹5.00/unit
*/
