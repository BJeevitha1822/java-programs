import java.util.Scanner;

public class SummaryExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        int sum = first + second;
        int difference = first - second;
        int product = first * second;

        System.out.println("\n--- Summary ---");

        System.out.printf("%-12s : %s%n", "Name", name);
        System.out.printf("%-12s : %d%n", "First", first);
        System.out.printf("%-12s : %d%n", "Second", second);
        System.out.printf("%-12s : %d%n", "Sum", sum);
        System.out.printf("%-12s : %d%n", "Difference", difference);
        System.out.printf("%-12s : %d%n", "Product", product);

        sc.close();
    }
}
