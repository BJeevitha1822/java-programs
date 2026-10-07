import java.util.Scanner;

public class ForLoopPalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int number = Math.abs(n);
        int original = number;
        int reverse = 0;

        for (; number > 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
        }

        if (original == reverse) {
            System.out.println("Palindrome number.");
        } else {
            System.out.println("Not a palindrome number.");
        }

        sc.close();
    }
}
