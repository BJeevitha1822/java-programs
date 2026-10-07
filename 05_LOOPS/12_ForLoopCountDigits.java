import java.util.Scanner;

public class ForLoopCountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int number = Math.abs(n);
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            for (; number > 0; number /= 10) {
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
