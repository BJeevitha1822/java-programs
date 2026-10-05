import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Positive Even Number");
            } else {
                System.out.println("Positive Odd Number");
            }
        } else if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("Negative Even Number");
            } else {
                System.out.println("Negative Odd Number");
            }
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
