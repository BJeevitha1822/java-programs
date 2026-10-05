import java.util.Scanner;

public class BankAccountEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your monthly income: ");
        double income = sc.nextDouble();

        if (age >= 18 && income >= 15000) {
            System.out.println("Eligible to open the account.");
        } else if (age >= 18) {
            System.out.println("Age eligible, but income is too low.");
        } else {
            System.out.println("Not eligible due to age.");
        }

        sc.close();
    }
}
