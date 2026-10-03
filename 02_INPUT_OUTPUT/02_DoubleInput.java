import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double number = sc.nextDouble();

        System.out.println("The number is: " + number);

        sc.close();
    }
}
