import java.util.Scanner;

public class ForLoopCountEvenOddDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int number = Math.abs(n);
        int evenCount = 0;
        int oddCount = 0;

        if (number == 0) {
            evenCount = 1;
        } else {
            for (; number > 0; number /= 10) {

                int digit = number % 10;

                if (digit % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);

        sc.close();
    }
}
