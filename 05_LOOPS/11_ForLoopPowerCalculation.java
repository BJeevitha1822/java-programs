import java.util.Scanner;

public class ForLoopPowerCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        long result = 1;

        if (exponent < 0) {
            System.out.println("Negative exponent is not supported.");
        } else {
            for (int i = 1; i <= exponent; i++) {
                result = result * base;
            }

            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
