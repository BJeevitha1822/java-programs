import java.util.Scanner;

public class LargestOfThreeUsingTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest = (a > b)
                    ? ((a > c) ? a : c)
                    : ((b > c) ? b : c);

        System.out.println("\n--- Largest of Three Numbers ---");
        System.out.println("Largest number: " + largest);

        sc.close();
    }
}
