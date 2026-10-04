import java.util.Scanner;

public class ATMWithdrawalEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdrawal = sc.nextDouble();

        if (withdrawal > 0) {

            if (withdrawal <= balance) {
                System.out.println("Withdrawal successful.");
                System.out.println("Remaining balance: " + (balance - withdrawal));
            } else {
                System.out.println("Insufficient balance.");
            }

        } else {
            System.out.println("Invalid withdrawal amount.");
        }

        sc.close();
    }
}
