import java.util.Scanner;

public class IncomeTaxCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();

        if (income <= 250000) {
            System.out.println("Tax Category: No Tax");
        } else if (income <= 500000) {
            System.out.println("Tax Category: Low");
        } else if (income <= 1000000) {
            System.out.println("Tax Category: Medium");
        } else {
            System.out.println("Tax Category: High");
        }

        sc.close();
    }
}
