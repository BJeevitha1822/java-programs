import java.util.Scanner;

public class ForLoopProductOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int number = Math.abs(n);
        long product = 1;

        if (number == 0) {
            product = 0;
        } else {
            for (; number > 0; number /= 10) {
                int digit = number % 10;
                product = product * digit;
            }
        }

        System.out.println("Product of digits: " + product);

        sc.close();
    }
}
