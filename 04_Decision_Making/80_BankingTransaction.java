import java.util.Scanner;

public class BankingTransaction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter transaction amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter transaction type (deposit/withdraw): ");
        String type = sc.next();

        if (amount <= 0) {
            System.out.println("Invalid transaction amount.");
        } else if (type.equalsIgnoreCase("deposit")) {

            balance = balance + amount;

            System.out.printf("Deposit successful.%n");
            System.out.printf("New balance: Rs. %.2f%n", balance);

        } else if (type.equalsIgnoreCase("withdraw")) {

            if (amount <= balance) {
                balance = balance - amount;

                System.out.println("Withdrawal successful.");
                System.out.printf("New balance: Rs. %.2f%n", balance);
            } else {
                System.out.println("Insufficient balance.");
            }

        } else {
            System.out.println("Invalid transaction type.");
        }

        sc.close();
    }
}
