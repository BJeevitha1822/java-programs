import java.util.Scanner;

public class NumberDivisibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 5 == 0 && number % 10 == 0) {
            System.out.println("Number is divisible by both 5 and 10.");
        } else if (number % 5 == 0) {
            System.out.println("Number is divisible by 5.");
        } else if (number % 10 == 0) {
            System.out.println("Number is divisible by 10.");
        } else {
            System.out.println("Number is not divisible by 5 or 10.");
        }

        sc.close();
    }
}
