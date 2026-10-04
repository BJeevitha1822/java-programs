import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int absolute = (number < 0) ? -number : number;

        System.out.println("\n--- Absolute Value ---");
        System.out.println("Absolute value: " + absolute);

        sc.close();
    }
}
