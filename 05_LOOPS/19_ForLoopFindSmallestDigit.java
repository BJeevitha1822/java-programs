import java.util.Scanner;

public class ForLoopFindSmallestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int number = Math.abs(n);
        int smallest = 9;

        for (; number > 0; number /= 10) {

            int digit = number % 10;

            if (digit < smallest) {
                smallest = digit;
            }
        }

        System.out.println("Smallest digit: " + smallest);

        sc.close();
    }
}
