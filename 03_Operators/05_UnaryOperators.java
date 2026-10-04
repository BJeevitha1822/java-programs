import java.util.Scanner;

public class UnaryOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("\n--- Unary Operations ---");

        System.out.println("Original number : " + number);
        System.out.println("Positive        : " + (+number));
        System.out.println("Negative        : " + (-number));

        number++;
        System.out.println("After increment : " + number);

        number--;
        System.out.println("After decrement : " + number);

        sc.close();
    }
}
