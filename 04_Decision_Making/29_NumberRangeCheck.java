import java.util.Scanner;

public class NumberRangeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number >= 1 && number <= 100) {
            System.out.println("Number is within the range 1 to 100.");
        } else {
            System.out.println("Number is outside the range 1 to 100.");
        }

        sc.close();
    }
}
