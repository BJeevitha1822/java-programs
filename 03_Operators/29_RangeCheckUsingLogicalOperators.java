import java.util.Scanner;

public class RangeCheckUsingLogicalOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = (number >= 10) && (number <= 100);

        System.out.println("\n--- Range Check ---");
        System.out.println("Is the number between 10 and 100? " + result);

        sc.close();
    }
}
