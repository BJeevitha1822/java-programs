import java.util.Scanner;

public class CombinedOperators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("\n--- Combined Assignment Operators ---");

        System.out.println("Original value : " + number);

        number += 5;
        System.out.println("After += 5     : " + number);

        number -= 2;
        System.out.println("After -= 2     : " + number);

        number *= 2;
        System.out.println("After *= 2     : " + number);

        number /= 2;
        System.out.println("After /= 2     : " + number);

        number %= 3;
        System.out.println("After %= 3     : " + number);

        sc.close();
    }
}
