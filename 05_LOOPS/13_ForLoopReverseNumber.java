import java.util.Scanner;

public class ForLoopReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int number = Math.abs(n);
        int reverse = 0;

        for (; number > 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
        }

        if (n < 0) {
            reverse = -reverse;
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}
