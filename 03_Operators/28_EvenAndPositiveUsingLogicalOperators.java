import java.util.Scanner;

public class EvenAndPositiveUsingLogicalOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = (number > 0) && (number % 2 == 0);

        System.out.println("\n--- Logical Operator Check ---");
        System.out.println("Is the number positive and even? " + result);

        sc.close();
    }
}
