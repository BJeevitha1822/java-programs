import java.util.Scanner;

public class CurrencyConverterUsingSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double amount = sc.nextDouble();

        System.out.print("Choose currency (1-USD, 2-EUR, 3-GBP): ");
        int choice = sc.nextInt();

        double convertedAmount;

        if (amount < 0) {
            System.out.println("Invalid amount.");
        } else {
            switch (choice) {
                case 1:
                    convertedAmount = amount / 83.0;
                    System.out.printf("Amount in USD: %.2f%n", convertedAmount);
                    break;

                case 2:
                    convertedAmount = amount / 90.0;
                    System.out.printf("Amount in EUR: %.2f%n", convertedAmount);
                    break;

                case 3:
                    convertedAmount = amount / 105.0;
                    System.out.printf("Amount in GBP: %.2f%n", convertedAmount);
                    break;

                default:
                    System.out.println("Invalid currency choice.");
            }
        }

        sc.close();
    }
}
