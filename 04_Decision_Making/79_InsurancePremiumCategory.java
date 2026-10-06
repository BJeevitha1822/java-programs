import java.util.Scanner;

public class InsurancePremiumCategory {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();

        if (age < 0 || income < 0) {
            System.out.println("Invalid input.");
        } else if (age <= 25 && income >= 500000) {
            System.out.println("Premium Category: Low");
        } else if (age <= 40 && income >= 500000) {
            System.out.println("Premium Category: Medium");
        } else if (age <= 60) {
            System.out.println("Premium Category: High");
        } else {
            System.out.println("Premium Category: Very High");
        }

        sc.close();
    }
}
