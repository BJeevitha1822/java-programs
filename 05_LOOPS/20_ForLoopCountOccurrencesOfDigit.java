import java.util.Scanner;

public class ForLoopCountOccurrencesOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Math.abs(sc.nextInt());

        System.out.print("Enter the digit to search: ");
        int target = sc.nextInt();

        int count = 0;

        if (target < 0 || target > 9) {
            System.out.println("Invalid digit.");
        } else {
            if (number == 0 && target == 0) {
                count = 1;
            } else {
                for (; number > 0; number /= 10) {

                    int digit = number % 10;

                    if (digit == target) {
                        count++;
                    }
                }
            }

            System.out.println("Occurrences: " + count);
        }

        sc.close();
    }
}
