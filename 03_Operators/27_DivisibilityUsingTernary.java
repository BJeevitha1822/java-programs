import java.util.Scanner;

public class DivisibilityUsingTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        String result = (number % divisor == 0)
                      ? "Divisible"
                      : "Not Divisible";

        System.out.println("\n--- Divisibility Check ---");
        System.out.println("Result: " + result);

        sc.close();
    }
}
