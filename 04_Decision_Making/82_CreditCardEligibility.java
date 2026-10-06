import java.util.Scanner;

public class CreditCardEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();

        if (age < 18) {
            System.out.println("Not eligible: Age must be at least 18.");
        } else if (income < 25000) {
            System.out.println("Not eligible: Income is too low.");
        } else if (creditScore < 650) {
            System.out.println("Not eligible: Credit score is too low.");
        } else {
            System.out.println("Eligible for a credit card.");
        }

        sc.close();
    }
}
