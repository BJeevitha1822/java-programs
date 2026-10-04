import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your monthly income: ");
        double income = sc.nextDouble();

        if (age >= 21) {

            if (income >= 25000) {
                System.out.println("You are eligible for the loan.");
            } else {
                System.out.println("Income is too low for the loan.");
            }

        } else {
            System.out.println("Age is too low for the loan.");
        }

        sc.close();
    }
}
