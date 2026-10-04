import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("\n--- Increment and Decrement ---");

        System.out.println("Original value : " + number);
        System.out.println("Pre-increment  : " + (++number));
        System.out.println("Post-increment : " + (number++));
        System.out.println("After increment: " + number);
        System.out.println("Pre-decrement  : " + (--number));
        System.out.println("Post-decrement : " + (number--));
        System.out.println("After decrement: " + number);

        sc.close();
    }
}
